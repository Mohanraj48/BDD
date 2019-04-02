/*
package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {

	
	@Before
	public void setup(){
		System.out.println("Browser is launch");
		System.out.println("Enter URL");
	}
	
	
	@After
	public void teardown(){
		System.out.println("Browser is closed now");
	}
	
	
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("before only first scenario");
	}
	
	
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("before only second scenario");
	}
	
	@After("@Second")
	public void afterSecond(){
		System.out.println("before only second scenario");
	}
	
	@Before("@Third")
	public void beforeThird(){
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird(){
		System.out.println("before only third scenario");
	}
	
	
	@Given("^This is first step$")
	public void this_is_first_step() throws Throwable {
	    System.out.println("This is First");
	}

	@When("^This is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("This is Second");
	}

	@Then("^This is third step$")
	public void this_is_third_step() throws Throwable {
		System.out.println("This is Third");
	}

	
}

*/