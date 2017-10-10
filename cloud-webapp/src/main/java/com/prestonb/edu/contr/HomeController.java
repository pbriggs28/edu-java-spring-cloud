package com.prestonb.edu.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.edu.conf.WebConstants.Models;
import com.prestonb.edu.conf.WebConstants.Redirects;
import com.prestonb.edu.conf.WebConstants.RequestMappings;
import com.prestonb.edu.conf.WebConstants.Views;
import com.prestonb.edu.svc.UserService;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@Controller
public class HomeController {
	@Autowired private UserService userService;

	@RequestMapping()
	public String redirectAll(Model model) {
		return Redirects.LOGIN;
	}

	// An illusion of login requirement as a stub until we implement Spring security:
	// Every page redirects to the login page and upon successful login
	// we redirect to the radius page
	@RequestMapping(path = RequestMappings.LOGIN, method = RequestMethod.GET)
	public String loginPageGET(Model model) {
		model.addAttribute(Models.USER, new UserAuthenticationToken());
		return Views.LOGIN;
	}
	
	@RequestMapping(path = RequestMappings.LOGIN, method = RequestMethod.POST)
	public String loginPagePOST(Model model, @ModelAttribute @Valid UserAuthenticationToken token
			, BindingResult errors) {

		if(errors.hasErrors()) {
			model.addAttribute(Models.ERROR_MSG, errors.getFieldError().getDefaultMessage());
			return loginPageGET(model);			
		}
		
		User user = userService.authenticate(token);
		if(user == null) {
			model.addAttribute(Models.ERROR_MSG, "Invalid username or password.");
			return loginPageGET(model);
		}
		
		model.addAttribute(Models.USER, user);

		return Redirects.RADIUS;
	}
}
