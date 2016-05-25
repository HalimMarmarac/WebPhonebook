package org.bildit.bo.user;

import java.sql.SQLException;

import org.bildit.dao.UserDaoImpl;
import org.bildit.dto.Contact;
import org.bildit.dto.User;

public class HelperBo {

	private static UserDaoImpl dao = new UserDaoImpl();

	public static boolean isUserNotNull(User user) {
		if (user == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidPassword(String password) {
		if ((password.length() < 4) || (password.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUsername(String username) {
		if ((username.length() < 1) || (username.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUser(User user) {
		if (isUserNotNull(user) && isValidPassword(user.getPassword()) && isValidUsername(user.getUsername())) {
			try {
				if (!dao.userExists(user.getUsername())) {
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	public static boolean isContactNotNull(Contact contact) {
		if (contact == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidContact(Contact contact) {

		if ((contact.getName().trim() != "") && (contact.getLastname().trim() != "")
				&& (contact.getEmail().trim() != "") && (contact.getPhone().trim() != "")) {
			
			return true;
		}

		return false;
	}

	public static boolean isValidId(int userId) {

		if (userId > 0) {
			return true;
		}

		return false;
	}
}