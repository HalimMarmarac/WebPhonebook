package org.bildit.dto;

public class User {


	//Data fields
	private int userId;
	private String username;
	private String password;
	private String email;
	
	//No-arg constructor
	public User() {
	}

	//Constructor with specified values
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	//Getters and Setters
	public int getuserId() {
		return userId;
	}
	
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
