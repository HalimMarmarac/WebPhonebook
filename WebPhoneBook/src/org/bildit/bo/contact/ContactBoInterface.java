package org.bildit.bo.contact;

import java.util.List;

import org.bildit.dto.Contact;

public interface ContactBoInterface {
	
	boolean createContact(Contact contact, String username);
	
	List<Contact> readAllContacts(String username);
	
	boolean deleteContact(Contact contact);
	
	Contact readContact(int id);
	
	List<Contact> readContactsByMatches(String match, String username);
	
	boolean updateContact(Contact contact);
}
