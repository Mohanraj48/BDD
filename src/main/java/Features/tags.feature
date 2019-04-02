@FunctionalTest
Feature: CRM application test


@SmokeTest @RegressionTest
Scenario Outline: Login and Create new contacts details

Given User is already on login page
When Title of login page is CRMPRO
Then User enter the "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move on contact page
Then user enters "<firstname>" and "<lastname>" and "<department>"


Examples:
	|	username	|	password	|	firstname	|	lastname	|	department		|
	|	Selenium_50	|	Abcd@123456	|	Mohanraj	|	K			|	QA tester		|
	|	Selenium_50	|	Abcd@123456	|	Sumesh		|	V			|	Manual tester	|
	|	Selenium_50	|	Abcd@123456	|	Vimal		|	P			|	IT-Support		|
	|	Selenium_50	|	Abcd@123456	|	Vijay		|	C			|	Account			|


@RegressionTest
Scenario: Create new deals details

Given User is on login page
When Title of login page is CRMPRO page
Then enter username and password
|	username	|	password	|
|	Selenium_50	|	Abcd@123456	|

Then clicks on login button
Then user getting home page
Then move on deals page
Then deals details
|	title	|	Amount	|	probability	|	comission	|
|	Wipro	|	5000	|		45		|		8		|
|	TCS		|	8000	|		25		|		20		|
|	CTS		|	15000	|		5		|		48		|

Then browser close

