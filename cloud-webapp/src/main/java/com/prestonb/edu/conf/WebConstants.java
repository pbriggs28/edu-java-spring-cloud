package com.prestonb.edu.conf;

public class WebConstants {

	public static final class RequestMappings {
		public static final String HOME = "/";
		public static final String RADIUS = "/radius";	
		public static final String LOGIN = "/login";		
	}

	public static final class Redirects {
		private static final String REDIRECT = "redirect:";
		public static final String RADIUS = REDIRECT + RequestMappings.RADIUS;	
		public static final String LOGIN = REDIRECT + RequestMappings.LOGIN;		
	}

	public static final class Views {
		public static final String RADIUS = "radius";	
		public static final String LOGIN = "login";	
	}
	
	public static final class Models {
		public static final String USER = "user";
		public static final String RADIUS = "radiusForm";
		public static final String AREA = "area";
	}
}
