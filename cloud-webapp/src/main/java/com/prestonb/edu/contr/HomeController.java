package com.prestonb.edu.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.svc.UserServiceClient;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

// TODO: Temporarily setup as rest before we convert to a front end
@RestController
public class HomeController {
	@Autowired private UserServiceClient userServiceClient;

	@RequestMapping()
	public String home() {
		return "Try: /login/admin/CAFEBABE";
	}
	
	@RequestMapping(path = "/login/{username}/{password}", method = RequestMethod.GET)
	public User loginPageGET(
			@PathVariable(name = "username", required = true) String username, 
			@PathVariable(name = "password", required = true) String password) {
		User user = loginPagePOST(new UserAuthenticationToken(username, password));
		
		return user;
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public User loginPagePOST(@RequestBody @Valid UserAuthenticationToken token) {
		User user = userServiceClient.authenticate(token);

		return user;
	}
}
