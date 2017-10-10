package com.prestonb.edu.svc;

import com.prestonb.edu.user.domain.User;
import com.prestonb.edu.user.domain.UserAuthenticationToken;

public interface UserService {

	User authenticate(UserAuthenticationToken auth);

}
