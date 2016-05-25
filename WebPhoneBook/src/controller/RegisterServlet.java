package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.bo.user.UserBoImpl;
import org.bildit.dto.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("page").equals("register")){
			request.getSession().invalidate();
			response.sendRedirect("register.jsp");
		} else if(request.getParameter("page").equals("login")) {
			request.getSession().invalidate();
			response.sendRedirect("login.jsp");
		}
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		UserBoImpl userBo = new UserBoImpl();
		User user = new User(username, password, email);
		boolean result = userBo.createUser(user);
		
		if(result){
			request.getSession().setAttribute("message", "Registracija uspjesna!");
			response.sendRedirect("login.jsp");
		} else {
			request.getSession().setAttribute("message", "Korisnicko ime zauzeto!");			
			response.sendRedirect("register.jsp");
		}
		
	}

}
