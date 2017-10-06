package com.prestonb.edu.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.edu.svc.UserServiceClient;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@Controller
public class HomeController {
	@Autowired private UserServiceClient userServiceClient;

	@RequestMapping()
	public String home(Model model) {
		model.addAttribute("userUrl", "/login/admin/CAFEBABE");
		return "home";
	}
	
	@RequestMapping(path = "/login/{username}/{password}", method = RequestMethod.GET)
	public String loginPageGET(
			Model model,
			@PathVariable(name = "username", required = true) String username, 
			@PathVariable(name = "password", required = true) String password) {
		
		return loginPagePOST(model, new UserAuthenticationToken(username, password));
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginPagePOST(Model model, @RequestBody @Valid UserAuthenticationToken token) {
		User user = userServiceClient.authenticate(token);
		model.addAttribute("user", user);

		return "user";
	}
}
