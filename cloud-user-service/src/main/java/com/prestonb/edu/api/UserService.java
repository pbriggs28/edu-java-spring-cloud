package com.prestonb.edu.api;

import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.user.api.UserApi;

@RestController
public class UserService implements UserApi {

	@Override
	public String home() {
		return "This is from the user-service!";
	}
}
