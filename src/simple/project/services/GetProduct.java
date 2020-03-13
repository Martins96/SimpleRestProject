package simple.project.services;

import simple.project.stub.StubbedProduct;
import spark.Request;
import spark.Response;

public class GetProduct implements REST_APIBasePojo {

	@Override
	public Object executeService(Request req, Response res) {
		String id = req.params("id");
		System.out.println("request for product, input ID is [" + id + "]");
		switch(id) {
			case "1":
				return gson.toJson(StubbedProduct.PRODUCT1);
			case "2":
				return gson.toJson(StubbedProduct.PRODUCT2);
			case "3":
				return gson.toJson(StubbedProduct.PRODUCT3);
			case "4":
				return gson.toJson(StubbedProduct.PRODUCT4);
			case "5":
				return gson.toJson(StubbedProduct.PRODUCT5);
			case "6":
				return gson.toJson(StubbedProduct.PRODUCT6);
			default:
				return gson.toJson("");
		}
	}

}
