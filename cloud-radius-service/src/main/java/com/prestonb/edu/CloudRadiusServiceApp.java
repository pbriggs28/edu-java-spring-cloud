package com.prestonb.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudRadiusServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(CloudRadiusServiceApp.class, args);
	}
}
