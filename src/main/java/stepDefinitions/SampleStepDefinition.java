package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDefinition {

	@Given("^Enter url$")
	public void Enter_url(){
	
		System.out.println("The URL is google.co.in");
		
	}
	
	@When("^User should enter username and password$")
	public void User_should_enter_username_and_password(){
		System.out.println("Username is          Mohanraj48");
		System.out.println("Password is          Mohan@24");
		
	}
	
	@Then("^User should get login successfull message$")
	public void User_should_get_login_successfull_message(){
		System.out.println("Successfully logged in");
	}
	
}
