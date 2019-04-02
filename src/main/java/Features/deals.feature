Feature: CRM deals feature

Scenario: Create new deals details

Given User is already on login page
When Title of login page is CRMPRO
Then User enter the username and password
|	Selenium_50	|	Abcd@123456	|

Then user clicks on login button
Then user is on home page
Then user move on deals page
Then user enters deals details
|	Wipro	|	5000	|	45	|	8	|
Then user quit the browser