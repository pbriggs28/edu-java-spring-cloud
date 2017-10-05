package com.prestonb.edu.svc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prestonb.edu.user.api.UserApi;

// Name of the service you want to communicate WITH
// TODO: Extract to constants JAR
@FeignClient("user-service")
public interface UserServiceClient extends UserApi {
	
}
