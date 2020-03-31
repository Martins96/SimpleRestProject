package simple.project;


import java.util.Arrays;

import simple.project.manager.ServicesList;
import simple.project.utils.CorsFilter;
import spark.Spark;

public class Main {

	public static void main(String[] args) {
		System.out.println("[SERVER-MAIN] Load parameters: " + Arrays.toString(args));
		System.out.println("[SERVER-MAIN] Loading REST API");
		Spark.port(1111);
		
		ServicesList.initalizeREST_API();
		ServicesList.initializeManager_API();
		
		Spark.after(CorsFilter.getFilter());
		
		Spark.awaitInitialization();
		System.out.println("[SERVER-MAIN] Initalization is complete - " + System.currentTimeMillis());
		System.out.println("[SERVER-MAIN] Ready for action");
		System.out.println("[SERVER-MAIN] Open browser to http://localhost:1111/");
		
	}
	

}
