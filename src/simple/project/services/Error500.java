package simple.project.services;

import spark.Request;
import spark.Response;

public class Error500 implements REST_APIBasePojo {
	
	@Override
	public Object executeService(Request req, Response res) {
		res.status(500);
		return "";
	}

}
