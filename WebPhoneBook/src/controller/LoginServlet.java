package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.bo.user.HelperBo;
import org.bildit.bo.user.UserBoImpl;
import org.bildit.dto.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user;

		if (HelperBo.isValidUsername(username) && HelperBo.isValidPassword(password)) {

			UserBoImpl bo = new UserBoImpl();

			user = bo.readUser(username, password);

			if (user == null) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return; // end the execution of the doPost
			}

			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			return; // end the execution of the doPost

		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}