package amazon.implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
  
	public List<String> getProductList(){
		List<String> productList= new LinkedList<String>();
		productList.add("Apple Macbook pro");
		productList.add("Apple Macbook Air");
		productList.add("iphone pro 12");
		productList.add("iphone pro 13");
		productList.add("iphone pro 14");
		return productList;
	}
}
