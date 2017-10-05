package com.prestonb.edu.svc;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.prestonb.edu.conf.AppConstants.SpringApplicationNames;
import com.prestonb.edu.user.api.UserApi;

// Name of the service you want to communicate WITH
// TODO: Extract to constants JAR
@FeignClient(SpringApplicationNames.USER_SERVICE)
public interface UserServiceClient extends UserApi {
	
}
