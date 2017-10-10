package com.prestonb.edu.svc.apiclient;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.prestonb.edu.conf.AppConstants.SpringApplicationNames;
import com.prestonb.edu.user.api.UserApi;

@FeignClient(SpringApplicationNames.USER_SERVICE)
public interface UserServiceClient extends UserApi {
	
}
