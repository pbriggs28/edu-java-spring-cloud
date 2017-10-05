package com.prestonb.edu.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;

public interface HomeController {
	
	@RequestMapping
	public String home();

}
