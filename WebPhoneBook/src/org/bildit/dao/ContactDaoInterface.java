package org.bildit.dao;

import java.sql.SQLException;

/**
 * Name: ContactDaoInterface
 * @author Dejan
 *
 */

import java.util.List;

import org.bildit.dto.Contact;


public interface ContactDaoInterface {
	
	boolean createContact(Contact contact, String username) throws SQLException;
	
	List<Contact> readAllContacts(String username) throws SQLException;
	
	Contact readContact(int id) throws SQLException;
	
	List<Contact> readContactsByMatches(String match, String username) throws SQLException;
	
	boolean updateContact(Contact contact) throws SQLException;
	
	boolean deleteContact(Contact contact) throws SQLException;

}
