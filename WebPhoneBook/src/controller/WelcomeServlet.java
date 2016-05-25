package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.bo.contact.ContactBoImpl;
import org.bildit.dto.Contact;
import org.bildit.dto.User;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/home")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("submit").equals("search")) {
			response.sendRedirect("welcome.jsp");
		} else if(request.getParameter("submit").equals("contacts")) {
			List<Contact> contacts = new ArrayList<>();
			User user = (User)request.getSession().getAttribute("user");
			ContactBoImpl contactBo = new ContactBoImpl();
			contacts = contactBo.readAllContacts(user.getUsername());
			
			if(contacts.size() != 0) {
				request.getSession().setAttribute("contacts", contacts);
				response.sendRedirect("listContacts.jsp");
			} else {
				request.setAttribute("addContactScreen", "No contacts to show.");
				request.getRequestDispatcher("addContact.jsp").forward(request, response);
			}
		} else if(request.getParameter("submit").equals("add")) {
			response.sendRedirect("addContact.jsp");
		}
		
	}

}
