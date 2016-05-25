package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.bo.contact.ContactBoImpl;
import org.bildit.dto.Contact;
import org.bildit.dto.User;


@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ContactBoImpl bo = new ContactBoImpl();

		// get the user from the session
		User user = (User) request.getSession(false).getAttribute("user");

		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");

		Contact contact = new Contact();

		// set contact values
		contact.setName(name);
		contact.setLastname(lastname);
		contact.setPhone(phone);
		contact.setAddress(address);
		contact.setEmail(email);

		if (bo.createContact(contact, user.getUsername())) {
			request.getSession().setAttribute("user", user);
			request.setAttribute("name", name);
			request.getRequestDispatcher("contactadded.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("contactnotadded.jsp").forward(request, response);
		}

	}

}
