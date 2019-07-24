package myFeaturesFor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class specifiedfeature1 {
	@Given("Smruti is done with browser configuration")
	public void smruti_is_done_with_browser_configuration() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for browser config");
	}

	@Then("she launches the application in her favourite chrome browser")
	public void she_launches_the_application_in_her_favourite_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for launching app");
	}

	@Given("She clicks on sign in link")
	public void she_clicks_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for signin");
	}

	@Then("She enters the valid creds")
	public void she_enters_the_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for valid creds");
	}

	@Then("He clicks on submit button")
	public void he_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for submit ");
	}

	@Given("Guest user clicks on signup link")
	public void guest_user_clicks_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for signup link");
	}

	@When("She provides all the mandatory data")
	public void she_provides_all_the_mandatory_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for all mandatory data");
	}

	@Then("She clicks on sbmt and id generated")
	public void she_clicks_on_sbmt_and_id_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(" code for submit and id generated");
	}

	@Given("She clicks on forgot password")
	public void she_clicks_on_forgot_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for forgot password");
	}

	@Then("She enters the mobile number")
	public void she_enters_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for entering mobile number");
	}

	@Then("She receives otp and the same he provides")
	public void she_receives_otp_and_the_same_he_provides() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for otp ");
	}

}
