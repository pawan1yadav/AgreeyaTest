package StepDefine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UberBookingSteps {
	
	@Given("User want to select a car type {string} from Uber application")
	public void uber_want_to_select_a_car_type_from_uber_app(String carType) {
	  System.out.println("Step1: "+ carType);
	}

	@When("User select a car {string} and pick up point {string} and drop location {string}")
	public void user_select_a_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation) {
		  System.out.println("Step2: "+carType+" "+pickUpLocation+" "+dropLocation); 
	}

	@Then("Driver start the journey")
	public void driver_start_the_journey() {
		  System.out.println("Step3: ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		  System.out.println("Step4: ");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer fare) {
		  System.out.println("Step5: "+ fare );
	}
}
