package StepDefine;

import amazon.implementation.Product;
import amazon.implementation.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;

	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
	   System.out.println("Step 1 : I am on search page");
	}

	@When("I search for product with a name {string} and price {int}")
	public void i_search_for_product_with_a_name_and_price(String productName, Integer price) {
		 System.out.println("Step 2 : Search product with name: "+productName+" price: "+ price); 
		 product= new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3 :Product "+productName+" is displayed");
	    
	    search=new Search();
	    String name=search.displayProduct(product);
	    System.out.println("Search product is: "+ name);
	    Assert.assertEquals(product.getProductName(), name);
	}
}
