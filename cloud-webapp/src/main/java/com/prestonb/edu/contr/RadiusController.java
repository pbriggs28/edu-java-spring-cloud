package com.prestonb.edu.contr;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.edu.conf.WebConstants.Models;
import com.prestonb.edu.conf.WebConstants.RequestMappings;
import com.prestonb.edu.conf.WebConstants.Views;
import com.prestonb.edu.radius.domain.RadiusForm;
import com.prestonb.edu.svc.RadiusServiceClient;

@Controller
public class RadiusController {
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired private RadiusServiceClient radiusServiceClient;

	@RequestMapping(value = RequestMappings.RADIUS, method = RequestMethod.GET)
	public String radiusPage(ModelMap model) {
		model.addAttribute(Models.RADIUS, new RadiusForm());
		return Views.RADIUS;
	}

	@RequestMapping(value = RequestMappings.RADIUS, method = RequestMethod.POST)
	public String radiusPagePost(ModelMap model, 
			@ModelAttribute(value = Models.RADIUS ) @Valid RadiusForm form, BindingResult errors) {
		
		if(errors.hasErrors())
			return Views.RADIUS;

		model.addAttribute(Models.RADIUS, (RadiusForm) radiusServiceClient.calculateRadius(form));
		
		return Views.RADIUS;
	}
}
