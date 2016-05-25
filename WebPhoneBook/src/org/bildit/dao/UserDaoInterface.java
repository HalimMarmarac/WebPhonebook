package org.bildit.dao;


import java.sql.SQLException;
import org.bildit.dto.User;


public interface UserDaoInterface {
	
	boolean createUser(User user) throws SQLException;
	
	User readUser(String username) throws SQLException;
	
	public User read(String username) throws SQLException;

	public boolean userExists(String username) throws SQLException;
}
