package myFeaturesFor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpecifiedFeatures {
	@Given("application url is working")
	public void application_url_is_working() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Code for working url");
	}

	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for enter username");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for enter password");
	}

	@Then("he clicks on submit button")
	public void he_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("Code for submit button");
	}

	@Then("verifies the login process")
	public void verifies_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		System.out.println("Code for login process");
	}

	@Then("he choose to close the application")
	public void he_choose_to_close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for closing application");
	}

}
