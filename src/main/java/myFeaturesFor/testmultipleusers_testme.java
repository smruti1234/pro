package myFeaturesFor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmultipleusers_testme {
	WebDriver driver;
	@Given("I am launching the testme application in chrome")
	public void i_am_launching_the_testme_application_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
		;
	}

	@Given("I click on SignIn link")
	public void i_click_on_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		
	}

	@When("I provide username {string}")
	public void i_provide_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for password");
	}

	@Then("I click on login and  verify the login status")
	public void i_click_on_login_and_verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for verfication");
	}


}
