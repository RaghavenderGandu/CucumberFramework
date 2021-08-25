Feature: Radio , Suggestion and dropdown Button.

Background: User Navigate to application.

Given navigate application.

Scenario: Testing radio Button.

	When Radio button is displayed.
	And click on "Radio2" option.
	Then verify radiobutton is checked or not.

Scenario: testing Suggestion class.

	When Enter value as "India" .
	Then Select value.
	
Scenario: Selecting dropdown value.

	Then Select value as "Option2" .
	
