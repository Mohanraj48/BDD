Feature: CRMPro Login Feature


#without examples keyword
#Scenario: CRMPro Login Test Scenario

#Given User is already on login page
#When Title of login page is CRMPRO
#Then User enter the "Selenium_50" and "Abcd@123456"
#Then user clicks on login button
#Then user is on home page
#Then user quit the browser


#Using Examples keyword
Scenario Outline: CRMPro Login Test Scenario

Given User is already on login page
When Title of login page is CRMPRO
Then User enter the "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user quit the browser

Examples:
	| username | password |
	| Selenium_50 | Abcd@123456 |
	| Mohanraj | Mohan@23 |