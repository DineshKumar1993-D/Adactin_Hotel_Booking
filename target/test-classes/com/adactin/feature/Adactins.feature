Feature: Test The Adactin Hotel Booking Application

@smoketest
Scenario Outline: Checks The Login Functionality

Given launch The Adactin Url
When user Enters The Username"<username>" In The Inputbox
And user Enters The Password "<password>"In The Inputbox
Then user Clicks The Loginbutton and Its Navigates The Search Hotel Page

Examples: 

	|username|password|
	|sivaguru|36567456|
	|selva|347674|
	|baalji|47867457|
