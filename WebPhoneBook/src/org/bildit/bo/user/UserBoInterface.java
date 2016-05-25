package org.bildit.bo.user;

import org.bildit.dto.User;

public interface UserBoInterface {
	
	boolean createUser(User user);
	
	User readUser(String username, String password);
	

}
