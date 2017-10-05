package com.prestonb.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigServerApp {

	public static void main(String[] args) {
		// TODO: Check if config server username/pw populated. Prompt if not
		SpringApplication.run(CloudConfigServerApp.class, args);
	}
}
