package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.bo.contact.ContactBoImpl;
import org.bildit.dto.Contact;


/**
 * Servlet implementation class EditContactServlet
 */
@WebServlet("/edit")
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ContactBoImpl bo = new ContactBoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get user id
		int id = Integer.parseInt(request.getParameter("id"));

		Contact contact = bo.readContact(id);

		request.setAttribute("contact", contact);
		request.getRequestDispatcher("editContact.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");

		Contact contact = new Contact();
		contact.setContactId(id);
		contact.setName(name);
		contact.setLastname(lastname);
		contact.setPhone(phone);
		contact.setAddress(address);
		contact.setEmail(email);
		

		if (bo.updateContact(contact)) {
			request.getRequestDispatcher("contactedited.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("contactnotedited.jsp").forward(request, response);

		}

	}
}
