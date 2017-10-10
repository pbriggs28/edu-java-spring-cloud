package com.prestonb.edu.conf;

import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

public abstract class AppConstants {

	/**
	 * Allows type-safe access to each service's spring.application.name
	 */
	public static abstract class SpringApplicationNames {
		public static final String CONFIG_SERVER = "config-server";
		public static final String EUREKA_SERVER = "eureka-server";
		public static final String RADIUS_SERVICE = "radius-service";
		public static final String USER_SERVICE = "user-service";
		public static final String WEBAPP = "webapp";
	}

	public static abstract class SpringProfiles {
		private static final String NOT = "!";
		
		public static final String LOCAL = "local";
		public static final String DEV = "dev";
		public static final String PROD = "prod";
		
		public static final String NOT_LOCAL = NOT + LOCAL;
		public static final String NOT_DEV = NOT + DEV;
		public static final String NOT_PROD = NOT + PROD;
	}
	
	public static abstract class DevUsers {
		public static abstract class ValidUser1 {
			private static final String FIRST_NAME = "Joshua";
			private static final String LAST_NAME = "Bloch";
			private static final String USERNAME = "admin";
			private static final String PASSWORD = "CAFEBABE";

			public static final User user;
			public static final UserAuthenticationToken authToken;
			static {
				authToken = new UserAuthenticationToken(USERNAME, PASSWORD);
				user = new User();
				user.setFirstName(FIRST_NAME);
				user.setLastName(LAST_NAME);
				user.setUsername(USERNAME);
				user.setPassword(PASSWORD);
			}
		}

		public static abstract class InvalidUser1 {
			private static final String FIRST_NAME = "Josh";
			private static final String LAST_NAME = "Block";
			private static final String USERNAME = "invalid";
			private static final String PASSWORD = "invalid";

			public static final User user;
			public static final UserAuthenticationToken authToken;
			static {
				authToken = new UserAuthenticationToken(USERNAME, PASSWORD);
				user = new User();
				user.setFirstName(FIRST_NAME);
				user.setLastName(LAST_NAME);
				user.setUsername(USERNAME);
				user.setPassword(PASSWORD);
			}
			
		}
	}
}
