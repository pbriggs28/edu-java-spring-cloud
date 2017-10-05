package com.prestonb.edu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudTaskServiceApp {
	
	@Value("${helloworld}")
	private String configServerProp = "default";

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskServiceApp.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Config Server Prop: " + configServerProp;
	}

	@RequestMapping("/hello-feign")
	public String helloFeign() {
		return "Hello World";
	}
}
