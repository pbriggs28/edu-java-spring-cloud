package com.prestonb.edu.user.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

public interface UserApi {
	
	public static abstract class EndPoints {
		private static final String AUTHENTICATE = "/auth";
	}
	
	/**
	 * Attempts to authenticate a given username and password. If successful
	 * returns the authenticated user, else returns null.
	 * 
	 * @param creds
	 * @return The authenticated user if successful or null if not.
	 */
	@RequestMapping(path = EndPoints.AUTHENTICATE, method = RequestMethod.POST)
	public User authenticate(@RequestBody UserAuthenticationToken creds);
	
}
