package org.bildit.bo.user;

import java.sql.SQLException;

import org.bildit.dao.UserDaoImpl;
import org.bildit.dto.User;

public class UserBoImpl implements UserBoInterface{
	
	UserDaoImpl dao = new UserDaoImpl();

	@Override
	public boolean createUser(User user)  {
		
		if(user != null){
			try {
				dao.createUser(user);
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;		
		} else
			return false;
	}

	@Override
	public User readUser(String username, String password) {

		User user = null;

		if (HelperBo.isValidPassword(password) && HelperBo.isValidUsername(username)) {
			try {

				user = dao.read(username);

				if (!user.getPassword().equals(password)) {
					user = null;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return user;
	}
}
