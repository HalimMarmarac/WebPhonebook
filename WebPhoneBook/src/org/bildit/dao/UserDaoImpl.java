package org.bildit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Name: UserDaoImpl
 * @author Dejan
 */

import org.bildit.dto.User;

public class UserDaoImpl implements UserDaoInterface {
	
	Connection connection = ConnectionManager.getInstance().getConnection();


	@Override
	public boolean createUser(User user) throws SQLException{
		
		String query = "INSERT INTO user(username, password, email) VALUES (?,?,?)";
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			
			statement.executeUpdate();
			
		}
		return true;
	}

	@Override
	public User readUser(String username) throws SQLException, NullPointerException{
		
		User user = null;
		ResultSet rs = null;
		String query = "SELECT * FROM user WHERE username=?";
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, username);
			
			rs = statement.executeQuery();
			if(rs.next()){
				user = new User(rs.getString("username"), rs.getString("password"), rs.getString("email"));
			}
			rs.close();
		
		}
		return user;
	}

	@Override
	public User read(String username) throws SQLException {

		User user = null;

		// create an SELECT SQL query
		String query = "SELECT * FROM user WHERE username = ?";

		// create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, username);

			// execute the query
			rs = statement.executeQuery();

			// set the cursor
			if (rs.next()) {

				// populate user
				user = new User();

				user.setuserId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));

			}

		}

		// close the ResultSet
		rs.close();

		return user;
	}

	@Override
	public boolean userExists(String username) throws SQLException {

		// create an SELECT SQL query
		String query = "SELECT * FROM user WHERE username = ?";

		// create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, username);

			// execute the query
			rs = statement.executeQuery();

			// set the cursor
			if (rs.next()) {
				return true;
			}

			return false;
		}

	}

}
