package simple.project.services;

import simple.project.beans.User;
import simple.project.beans.UserLoginInput;
import simple.project.stub.StubbedUsers;
import spark.Request;
import spark.Response;

public class LoginService implements REST_APIBasePojo {

	@Override
	public Object executeService(Request req, Response res) {
		UserLoginInput input = gson.fromJson(req.body(), UserLoginInput.class);
		System.out.println("Received for Login input: " + input);
		User user = verifyUser(input);
		System.out.println("Found user: " + user);
		
		res.header("Content-Type", "application/json");
		return gson.toJson(user);
	}
	
	private User verifyUser(UserLoginInput input) {
		if(input == null)
			return null;
		
		UserLoginInput userLogin1 = StubbedUsers.USERLOGIN1;
		if(userLogin1.getUsername().equalsIgnoreCase(input.getUsername()) &&
				userLogin1.getPassword().equals(input.getPassword())) {
			return StubbedUsers.USER1;
		}
		
		UserLoginInput userLogin2 = StubbedUsers.USERLOGIN2;
		if(userLogin2.getUsername().equalsIgnoreCase(input.getUsername()) &&
				userLogin2.getPassword().equals(input.getPassword())) {
			return StubbedUsers.USER2;
		}
		
		return null;
	}
	
}
