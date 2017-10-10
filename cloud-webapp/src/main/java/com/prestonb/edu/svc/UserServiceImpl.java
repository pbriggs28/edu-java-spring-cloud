package com.prestonb.edu.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.prestonb.edu.conf.AppConstants.SpringProfiles;
import com.prestonb.edu.svc.apiclient.UserServiceClient;
import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

@Profile(SpringProfiles.NOT_DEV)
@Service
public class UserServiceImpl implements UserService {
	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired private UserServiceClient userServiceClient;
	
	@Override
	public User authenticate(UserAuthenticationToken auth) {
		return userServiceClient.authenticate(auth);
	}
}
