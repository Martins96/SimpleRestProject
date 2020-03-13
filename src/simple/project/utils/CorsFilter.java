package simple.project.utils;


import java.util.HashMap;
import spark.Filter;
import spark.Request;
import spark.Response;

/**
 * Really simple helper for enabling CORS in a spark application;
 */
public class CorsFilter {

	private static final HashMap<String, String> corsHeaders = new HashMap<>();

	static {
		corsHeaders.put("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
		corsHeaders.put("Access-Control-Allow-Origin", "*");
		//corsHeaders.put("Access-Control-Allow-Headers", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin,");
		corsHeaders.put("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Accept,Authorization,Origin,Access-Control-Request-Method,Access-Control-Request-Headers");
		corsHeaders.put("Access-Control-Expose-Headers", "Access-Control-Allow-Origin,Access-Control-Allow-Credentials");
		corsHeaders.put("Access-Control-Allow-Credentials", "true");
	}

	public static Filter getFilter() {
		Filter filter = new Filter() {
			@Override
			public void handle(Request req, Response res) throws Exception {				
				corsHeaders.forEach((k, v) -> res.header(k, v));
			}
		};

		return filter;
	}
}