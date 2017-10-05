package com.prestonb.edu.svc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// Name of the service you want to communicate WITH
@FeignClient("service1")
public interface UserClient {

	@RequestMapping("/hello-feign")
	public String helloFeign();
}
