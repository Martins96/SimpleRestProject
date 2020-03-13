package simple.project.manager;

import static spark.Spark.get;
import static spark.Spark.post;

import simple.project.services.Error401;
import simple.project.services.Error500;
import simple.project.services.GetProduct;
import simple.project.services.GetProducts;
import simple.project.services.LoginService;
import simple.project.services.manage.ManagerService;
import simple.project.services.manage.SwaggerService;


/** @author Luca Martinelli - IBM CIC
 *	
 *	This class contains all service REST exposed to FE
 */
public class ServicesList {
	
	public static void initalizeREST_API() {
		get("/getproducts", new GetProducts()::executeService);
		get("/getproduct/:id", new GetProduct()::executeService);
		
		get("/error401", new Error401()::executeService);
		get("/error500", new Error500()::executeService);
		
		post("/login", new LoginService()::executeService);
	}
	
	public static void initializeManager_API() {
		get("/", new ManagerService()::executeService);
		get("/manager", new ManagerService()::executeService);
		get("/swagger", new SwaggerService()::executeService);
	}
	
}
