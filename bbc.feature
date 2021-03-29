#Simple data driven without examples
Feature: Login scenario
Scenario: User logs in to bbc page
	Given User is on bbc page
	When Title of the page is BBC - Home
	Then User clicks on Sign in button
	Then User enters "abchjjh" and "fghhg78"
	Then User clicks on the sign in button
	
