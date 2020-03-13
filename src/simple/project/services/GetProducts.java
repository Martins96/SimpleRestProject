package simple.project.services;

import simple.project.beans.Product;
import simple.project.stub.StubbedProduct;
import spark.Request;
import spark.Response;

public class GetProducts implements REST_APIBasePojo {

	@Override
	public Object executeService(Request req, Response res) {
		
		Product[] productList = {
				StubbedProduct.PRODUCT1,
				StubbedProduct.PRODUCT2,
				StubbedProduct.PRODUCT3,
				StubbedProduct.PRODUCT4,
				StubbedProduct.PRODUCT5,
				StubbedProduct.PRODUCT6
			};
		
		System.out.println("Request for product received");
		res.header("Content-Type", "application/json");
		
		return gson.toJson(productList);
	}

}
