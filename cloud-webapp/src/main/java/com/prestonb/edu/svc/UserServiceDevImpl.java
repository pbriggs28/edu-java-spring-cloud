package com.prestonb.edu.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.prestonb.edu.conf.AppConstants.DevUsers;
import com.prestonb.edu.conf.AppConstants.SpringProfiles;
import com.prestonb.edu.svc.apiclient.UserServiceClient;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@Profile(SpringProfiles.DEV)
@Service
public class UserServiceDevImpl implements UserService {
	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired private UserServiceClient userServiceClient;
	
	@HystrixCommand(fallbackMethod = "authenticateFallback")
	@Override
	public User authenticate(UserAuthenticationToken auth) {
		return userServiceClient.authenticate(auth);
	}

	/**
	 * This service implementation is only active in dev mode. If an error occurs authenticating
	 * just allow the developer to login anyways.
	 * @param auth
	 * @return
	 */
	@SuppressWarnings("unused")
	private User authenticateFallback(UserAuthenticationToken auth) {
		log.warn("Fault in connection to user service. Falling back to authenticateFallback method");
		
		return DevUsers.ValidUser1.user;
	}
}
