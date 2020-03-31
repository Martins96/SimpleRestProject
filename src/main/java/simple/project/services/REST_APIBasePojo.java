package simple.project.services;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;

public interface REST_APIBasePojo {
	
	public static final Gson gson = new Gson();
	
	public Object executeService(Request req, Response res);
	
}
