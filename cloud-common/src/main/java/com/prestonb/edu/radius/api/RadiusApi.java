package com.prestonb.edu.radius.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.edu.conf.WebConstants.EndPoints;
import com.prestonb.edu.radius.domain.RadiusForm;

public interface RadiusApi {

	@RequestMapping(path = EndPoints.Radius.CALCULATE_RADIUS, method = RequestMethod.POST)
	public RadiusForm calculateRadius(@RequestBody RadiusForm radius);
}
