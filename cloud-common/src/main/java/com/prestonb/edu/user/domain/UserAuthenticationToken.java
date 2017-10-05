package com.prestonb.edu.user.domain;

import org.hibernate.validator.constraints.NotBlank;

public class UserAuthenticationToken {
	@NotBlank(message = "Username must not be empty.")
	private String username;
	@NotBlank(message = "Password must not be empty.")
	private String password;

	public UserAuthenticationToken() {
		
	}
	
	public UserAuthenticationToken(String username, String password) {
		this.username = username;
		this.password = password;
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
	
	// Be sure to mask password if regenerating this
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserAuthenticationToken [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append("***MASKED***");
		builder.append("]");
		return builder.toString();
	}
}
