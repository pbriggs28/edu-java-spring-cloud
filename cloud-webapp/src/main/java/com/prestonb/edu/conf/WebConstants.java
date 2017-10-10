package com.prestonb.edu.conf;

public abstract class WebConstants {

	public static abstract class RequestMappings {
		public static final String HOME = "/";
		public static final String RADIUS = "/radius";	
		public static final String LOGIN = "/login";		
	}

	public static abstract class Redirects {
		private static final String REDIRECT = "redirect:";
		public static final String RADIUS = REDIRECT + RequestMappings.RADIUS;	
		public static final String LOGIN = REDIRECT + RequestMappings.LOGIN;		
	}

	public static abstract class Views {
		public static final String RADIUS = "radius";	
		public static final String LOGIN = "login";	
	}
	
	public static abstract class Models {
		public static final String USER = "user";
		public static final String RADIUS = "radiusForm";
		public static final String AREA = "area";
		public static final String ERROR_MSG = "errMsg";
	}
}
