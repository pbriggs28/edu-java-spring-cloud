package com.prestonb.edu.conf;

public abstract class AppConstants {

	/**
	 * Allows type-safe access to each service's spring.application.name
	 */
	public static abstract class SpringApplicationNames {
		public static final String CONFIG_SERVER = "config-server";
		public static final String EUREKA_SERVER = "eureka-server";
		public static final String TASK_SERVICE = "task-service";
		public static final String USER_SERVICE = "user-service";
		public static final String WEBAPP = "webapp";
	}
}
