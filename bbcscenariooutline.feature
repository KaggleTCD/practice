Feature: User logs in to bbc page
Scenario Outline: User logs in to bbc page
	Given User is on the bbc page
	When The title of the page is BBC - Home
	Then User clicks on the Sign in Button
	Then User enters "<username>" and "<password>"
	Then User clicks on the Sign in button
	
Examples:
	| username | password |
	| ghhhhjjj | hjgjbhhjk78 |
	| fghghghgh | yhghhjhjjh78 |