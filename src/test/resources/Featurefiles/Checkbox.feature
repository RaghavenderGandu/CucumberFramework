Feature: Checkbox , switchTO window , switchto tab.

Background: User Navigate to application.

Given navigate application.
And click on "Option2" in checkbox option.


Scenario: Testing Checkbox.

	
	Then send checkbox output.

Scenario: testing Switchto window.

	When Click on switchto window button .
	And Click on course link.
	Then send switchto window output.
	
Scenario: testing switchto tab.

	When Click on switchto Tab button .
	And Click on course link in new tab.
	Then send switchto tab output.
	