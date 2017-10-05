package com.prestonb.edu.user.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface UserApi {
	
	@RequestMapping("/")
	public String home();
	
}
