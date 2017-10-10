package com.prestonb.edu.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.prestonb.edu.radius.domain.RadiusForm;
import com.prestonb.edu.svc.apiclient.RadiusServiceClient;

@Service
public class RadiusServiceImpl implements RadiusService {
	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired private RadiusServiceClient radiusServiceClient;

	@HystrixCommand(fallbackMethod = "calculateRadiusFallback")
	@Override
	public RadiusForm calculateRadius(RadiusForm radiusForm) {
		return radiusServiceClient.calculateRadius(radiusForm);
	}

	@SuppressWarnings("unused")
	private RadiusForm calculateRadiusFallback(RadiusForm radiusForm) {
		log.warn("Fault in connection to radius service. Falling back to calculateRadiusFallback method");
		radiusForm.setArea(Math.PI * (radiusForm.getRadius() * radiusForm.getRadius()));
		
		return radiusForm;
	}
}
