package com.prestonb.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.svc.UserClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class CloudClient1App {
	
	@Autowired
	private UserClient userClient;

	public static void main(String[] args) {
		SpringApplication.run(CloudClient1App.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "From userClient: " + userClient.helloFeign();
	}
}
