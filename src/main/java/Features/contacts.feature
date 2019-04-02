Feature: CRM contacts feature

Scenario Outline: Create new contacts details

Given User is already on login page
When Title of login page is CRMPRO
Then User enter the "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move on contact page
Then user enters "<firstname>" and "<lastname>" and "<department>"
Then user quit the browser

Examples:
	|	username	|	password	|	firstname	|	lastname	|	department		|
	|	Selenium_50	|	Abcd@123456	|	Mohanraj	|	K			|	QA tester		|
	|	Selenium_50	|	Abcd@123456	|	Sumesh		|	V			|	Manual tester	|
	|	Selenium_50	|	Abcd@123456	|	Vimal		|	P			|	IT-Support		|
	|	Selenium_50	|	Abcd@123456	|	Vijay		|	C			|	Account			|