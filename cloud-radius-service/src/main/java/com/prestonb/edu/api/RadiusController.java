package com.prestonb.edu.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.edu.radius.api.RadiusApi;
import com.prestonb.edu.radius.domain.RadiusForm;

@RestController
public class RadiusService implements RadiusApi {

	@Override
	public RadiusForm calculateRadius(@RequestBody @Valid RadiusForm radiusForm) {
		radiusForm.setArea( Math.PI * (radiusForm.getRadius() * radiusForm.getRadius()));
		
		return radiusForm;
	}

}
