package src.tests.validic;

import src.main.validic.core.Request;
import src.main.validic.core.User;

class TestHelper {
	
	public static Request CreateUserRequest(String accessToken, String uid) {
		Request request = new Request();
		request.setAccessToken(accessToken);
		User u = new User();
		u.setUid(uid);
		request.setUser(u);
		return request;
	}

}
