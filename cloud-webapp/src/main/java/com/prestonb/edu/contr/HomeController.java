package com.prestonb.edu.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.svc.UserServiceClient;

// TODO: Temporarily setup as rest before we convert to a front end
@RestController
public class HomeController {
	@Autowired private UserServiceClient userServiceClient; 

	@RequestMapping("/")
	public String homePage() {
		return "Making call to UserServiceClient from WebApp returned: " + userServiceClient.home();
	}
}
