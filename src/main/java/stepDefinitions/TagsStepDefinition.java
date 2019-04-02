/*
package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsStepDefinition {

WebDriver driver;
	
	
	
	@Given("^User is already on login page$")
	public void User_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");		
	}
	
	@When("^Title of login page is CRMPRO$")
	public void title_of_login_page_is_CRMPRO(){
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@Then("^User enter the \"(.*)\" and \"(.*)\"$")
	public void user_enter_the_username_and_password(String username, String password){
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);   
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Exception{
	    String title=driver.getTitle();
	    System.out.println("Home page title is	"+title);
	    Assert.assertEquals("CRMPRO", title);
	    Thread.sleep(2000);
	}
	
	@Then("^user move on contact page$")
	public void user_move_on_contact_page() throws Exception{
		driver.switchTo().frame("mainpanel");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_and(String firstname, String lastname, String department) throws Exception {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("department")).sendKeys(department);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();	
		
		driver.close();
	}

	@Given("^User is on login page$")
	public void User_is_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");		
	}
	
	@When("^Title of login page is CRMPRO page$")
	public void title_of_login_page_is_CRMPRO_page(){
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@Then ("^enter username and password$")
	public void enter_username_and_password(DataTable credentials){
		for(Map<String,String> data: credentials.asMaps(String.class, String.class))
		{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
		}
	}
	
	@Then("^clicks on login button$")
	public void clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	@Then("^user getting home page$")
	public void user_getting_home_page() throws Exception{
	    String title=driver.getTitle();
	    System.out.println("Home page title is	"+title);
	    Assert.assertEquals("CRMPRO", title);
	    Thread.sleep(2000);
	}
	
	@Then("^move on deals page$")
	public void move_on_deals_page() throws Exception {
		driver.switchTo().frame("mainpanel");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		Thread.sleep(5000);
	}
	
	@Then("^deals details$")
	public void deals_details(DataTable dealdata) throws Exception {
		for(Map<String,String> data: dealdata.asMaps(String.class, String.class))
		{
		driver.findElement(By.id("title")).sendKeys(data.get("title"));
		driver.findElement(By.id("amount")).sendKeys(data.get("Amount"));
		driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(data.get("comission"));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		Thread.sleep(2000);
		
		}
	   
	}
	
	@Then("^browser close$")
	public void browser_close() {
	    driver.quit();
	}
	
	
	
}

*/