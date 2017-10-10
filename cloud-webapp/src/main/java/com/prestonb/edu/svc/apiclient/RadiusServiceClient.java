package com.prestonb.edu.svc;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.prestonb.edu.conf.AppConstants.SpringApplicationNames;
import com.prestonb.edu.radius.api.RadiusApi;

@FeignClient(SpringApplicationNames.RADIUS_SERVICE)
public interface RadiusServiceClient extends RadiusApi {
	
}
