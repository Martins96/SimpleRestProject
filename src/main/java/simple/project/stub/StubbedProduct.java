package simple.project.stub;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import simple.project.beans.Product;

public class StubbedProduct {
	
	private final static Logger log = LogManager.getLogger(StubbedProduct.class);
	
	public static final Product PRODUCT1 = getProduct("1");
	public static final Product PRODUCT2 = getProduct("2");
	public static final Product PRODUCT3 = getProduct("3");
	public static final Product PRODUCT4 = getProduct("4");
	public static final Product PRODUCT5 = getProduct("5");
	public static final Product PRODUCT6 = getProduct("6");
	
	private static Product getProduct(String id) {
		final Properties prop = new Properties();
		Product p = new Product();
		try (InputStream is = StubbedProduct.class.getResourceAsStream("/products.properties")) {
			prop.load(is);
			String[] v = prop.getProperty("product." + id, "").split("\\|\\|");
			if (v.length == 5) {
				p.setId(v[0]);
				p.setName(v[1]);
				p.setPrice(v[2]);
				p.setDescription(v[3]);
				p.setImage(v[4]);
			} else {
				log.error("Properties file 'products.properties' is not well configured for product: product." + id);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return p;
	}
	
}
