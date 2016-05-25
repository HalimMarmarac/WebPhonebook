package controller;

import java.io.IOException;
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
 * Servlet implementation class ListContactsServlet
 */
@WebServlet("/listContacts")
public class ListContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get the user from the session
		User user = (User) request.getSession(false).getAttribute("user");

		ContactBoImpl bo = new ContactBoImpl();

		List<Contact> contacts = bo.readAllContacts(user.getUsername());

		request.setAttribute("contacts", contacts);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("listContacts.jsp").forward(request, response);

	}
}
