package org.bildit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Name: ContactDaoImpl;
 * @author Dejan
 */

import java.util.List;

import org.bildit.dto.Contact;

public class ContactDaoImpl implements ContactDaoInterface {
	
	Connection connection = ConnectionManager.getInstance().getConnection();

	
	@Override
	public boolean createContact(Contact contact, String username) throws SQLException{
		
		String query = "INSERT INTO contact(firstName, lastName,  phoneNumber, address, email, userUsername) "
				+ "values(?,?,?,?,?,?)";
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, contact.getName());
			statement.setString(2, contact.getLastname());
			statement.setString(3, contact.getPhone());
			statement.setString(4, contact.getAddress());
			statement.setString(5, contact.getEmail());
			statement.setString(6, username);
			
			statement.executeUpdate();
		}
		return true;
	}

	@Override
	public List<Contact> readAllContacts(String username) throws SQLException{
		
		List<Contact> contacts = new ArrayList<>();
		String query = "SELECT * FROM contact where userUsername=?";
		ResultSet rs = null;
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, username);
			
			rs = statement.executeQuery();
			while(rs.next()){
				Contact contact = new Contact();
				contact.setContactId(rs.getInt("idContact"));
				contact.setName(rs.getString("firstName"));
				contact.setLastname(rs.getString("lastName"));
				contact.setPhone(rs.getString("phoneNumber"));
				contact.setAddress(rs.getString("address"));
				contact.setEmail(rs.getString("email"));
				contacts.add(contact);
			}
		}
		return contacts;
	}

	@Override
	public Contact readContact(int id) throws SQLException{

		Contact contact = null;
		String query = "SELECT * FROM contact WHERE idContact=?";
		ResultSet rs = null;
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, id);
			
			rs = statement.executeQuery();
			if(rs.next()) {
				contact = new Contact();
				contact.setContactId(rs.getInt("idContact"));
				contact.setName(rs.getString("firstName"));
				contact.setLastname(rs.getString("lastName"));
				contact.setPhone(rs.getString("phoneNumber"));
				contact.setAddress(rs.getString("address"));
				contact.setEmail(rs.getString("email"));
			}
			rs.close();
		}		
		return contact;
	}
	
	@Override
	public List<Contact> readContactsByMatches(String match, String username) throws SQLException{
		
		List<Contact> contacts = new ArrayList<>();
		String query = "SELECT * FROM contact where (firstName LIKE ? OR lastName LIKE ?) AND userUsername=?";
		ResultSet rs = null;
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, "%" + match + "%");
			statement.setString(2, "%" + match + "%");
			statement.setString(3, username);
			
			rs = statement.executeQuery();
			while(rs.next()){
				Contact contact = new Contact();
				contact.setContactId(rs.getInt("idContact"));
				contact.setName(rs.getString("firstName"));
				contact.setLastname(rs.getString("lastName"));
				contact.setPhone(rs.getString("phoneNumber"));
				contact.setAddress(rs.getString("address"));
				contact.setEmail(rs.getString("email"));
				contacts.add(contact);
			}
		}
		return contacts;
	}

	@Override
	public boolean updateContact(Contact contact) throws SQLException{
		String query = "UPDATE contact SET firstName = ?, lastName = ?, phoneNumber = ?,"
				+ "address = ?, email = ? WHERE idContact = ?";
	       
		try(PreparedStatement statement = connection.prepareStatement(query)){
			statement.setString(1, contact.getName());
			statement.setString(2, contact.getLastname());
			statement.setString(3, contact.getPhone());
			statement.setString(4, contact.getAddress());
			statement.setString(5, contact.getEmail());
			statement.setInt(6, contact.getContactId());
	           
			statement.executeUpdate();
	        }
		return true;	
	}

	@Override
	public boolean deleteContact(Contact contact) throws SQLException{
		
		String query = "DELETE FROM contact WHERE idContact=?";
		
		try(PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, contact.getContactId());
			
			statement.executeUpdate();
		}
		return true;
	}
}
