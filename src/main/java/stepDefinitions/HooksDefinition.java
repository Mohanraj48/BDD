/*
package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDefinition 
{

	@Before
	public void setup(){
		System.out.println("Browser is launch");
		System.out.println("Free CRM application page displayed");
	}
	
	
	@After
	public void teardown(){
		System.out.println("Browser is closed now");
	}
	
	@Given("^User is on contact page$")
	public void User_is_on_contact_page(){
		
		System.out.println("Contact page is displayed");
	}
	
	@When("^user create contact$")
	public void user_create_contact() throws Throwable {
	    System.out.println("Contacts create page is displayed");
	}
	
	@Then("^contacts are created$")
	public void contacts_are_created() throws Throwable {
	    System.out.println("Contacts created successfully");
	}
	
	
	
	@Given("^User is on deal page$")
	public void user_is_on_deal_page() throws Throwable {
	    System.out.println("dael page is displayed");
	}

	@When("^User create the deals$")
	public void user_create_the_deals() throws Throwable {
		System.out.println("deals create page is displayed");
	}

	@Then("^Deals created$")
	public void deals_created() throws Throwable {
		System.out.println("deals created successfully");
	}

	@Given("^User is on mail page'$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("mail page is displayed");
	}

	@When("^User fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("mail create page is displayed");
	}

	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
		System.out.println("Mail is created successfully");
	}

}
*/