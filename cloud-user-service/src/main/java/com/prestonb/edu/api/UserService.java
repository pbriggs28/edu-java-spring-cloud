package com.prestonb.edu.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.conf.AppConstants.DevUsers;
import com.prestonb.edu.user.api.UserApi;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@RestController
public class UserService implements UserApi {
	
	// TODO: Extract to DAO layer once built
	private User adminUser = DevUsers.ValidUser1.user;

	@Override
	public User authenticate(@RequestBody @Valid UserAuthenticationToken creds) {
		
		if(adminUser.getUsername().equals(creds.getUsername()) 
				&& adminUser.getPassword().equals(creds.getPassword()))
			return adminUser;
		else
			return null;
	}
}
