Feature: Testing ScenarioOutline

Scenario Outline: Testing radio Button.

	Given navigate application.
	When Click on <checkboxvalue> in checkboxes.
	Then verify output.
	
Examples:
		|  checkboxvalue |
		|  "Option1"  |
		|  "Option2"  |
		|  "Option3"  |