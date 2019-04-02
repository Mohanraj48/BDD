Feature: CRM app test

Scenario: CRM contact page test
	Given User is on contact page
	When user create contact
	Then contacts are created
	
Scenario: CRM Deal page test
	Given User is on deal page
	When User create the deals
	Then Deals created
	
Scenario Outline: CRM mail page test
	Given User is on mail page'
	When User fills the mail form
	Then mail is created
	Examples:
	|mail1|
	|mail2|
	|mail3|
	