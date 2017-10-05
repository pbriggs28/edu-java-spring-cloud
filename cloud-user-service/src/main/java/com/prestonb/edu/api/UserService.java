package com.prestonb.edu.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.user.api.UserApi;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@RestController
public class UserService implements UserApi {
	
	private User adminUser;
	{
		adminUser = new User();
		adminUser.setFirstName("Joshua");
		adminUser.setLastName("Bloch");
		adminUser.setUsername("admin");
		adminUser.setPassword("CAFEBABE");
	}

	@Override
	public User authenticate(@RequestBody @Valid UserAuthenticationToken creds) {
		
		if(adminUser.getUsername().equals(creds.getUsername()) 
				&& adminUser.getPassword().equals(creds.getPassword()))
			return adminUser;
		else
			return null;
	}
}
