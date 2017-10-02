package com.prestonb.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.model.UserClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class EduJavaSpringCloudDiscoveryEurekaClient1 {
	
	@Autowired
	private UserClient userClient;

	public static void main(String[] args) {
		SpringApplication.run(EduJavaSpringCloudDiscoveryEurekaClient1.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "From userClient: " + userClient.helloFeign();
	}
}
