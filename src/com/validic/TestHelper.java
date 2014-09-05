package com.validic;

import com.validic.core.Request;
import com.validic.core.User;

public class TestHelper {
	
	public static Request CreateUserRequest(String accessToken, String uid) {
		Request request = new Request();
		request.setAccessToken(accessToken);
		User u = new User();
		u.setUid(uid);
		request.setUser(u);
		return request;
	}

}
