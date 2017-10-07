package com.prestonb.edu.conf;

public class WebConstants {


	public static abstract class EndPoints {
		public static abstract class User {
			public static final String AUTHENTICATE = "/auth";
		}

		public static abstract class Radius {
			public static final String CALCULATE_RADIUS = "/calculate-radius";
		}
	}
}
