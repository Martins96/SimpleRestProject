package simple.project.services.manage;


import spark.Request;
import spark.Response;

public class ManagerService {
	
	
	public String executeService(Request req, Response res) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html style = \"font-family:courier;\">");
		sb.append("<head><title>Welcome Page Manager</title></head><body>");
		sb.append("<h1>Server Manager</h1><br/>");
		sb.append("<h2>Status <text style='color: #0b0;'>Active<text></h2><br/>");
		sb.append("<h3>Swagger file:</h3>");
		sb.append("<p>Swagger file is exposed to: http://" + req.host() + "/swagger</p>");
		sb.append("<h3>Services:</h3>");
		sb.append("<div><p>");
		sb.append("<h5>GET Method:</h5>");
		sb.append("http://" + req.host() + "/getproducts");
		sb.append("<br/>");
		sb.append("http://" + req.host() + "/getproduct/:id");
		sb.append("<br/><p>Where ID is a number from 1 to 6, and return the relative product</p>");
		sb.append("<br/>");
		sb.append("http://" + req.host() + "/error401");
		sb.append("<br/><p>Return an empty response with http status 401</p>");
		sb.append("<br/>");
		sb.append("http://" + req.host() + "/error500");
		sb.append("<br/><p>Return an empty response with http status 500</p>");
		sb.append("<br/><br/>");
		sb.append("<h5>POST Method:</h5>");
		sb.append("http://" + req.host() + "/login");
		sb.append("<br/><p>Login interface: set in body of post an json string with <b>username</b> and <b>password</b> fields</p>");
		sb.append("<p>User registrated:<table border='1'>");
		sb.append("<thead><tr><td>USERNAME</td><td>PASSWORD</td></tr></thead>");
		sb.append("<tbody><tr><td>userone</td><td>password1</td></tr><tr><td>usertwo</td><td>password2</td></tr>");
		sb.append("</tbody></p>");
		sb.append("</p></div>");
		sb.append("<br/>");
		sb.append("</body></html>");
		
		res.header("Content-Type", "text/html");
		return sb.toString();
	}
	
}
