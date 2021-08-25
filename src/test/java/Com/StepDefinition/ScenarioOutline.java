package Com.StepDefinition;

import Com.Locators.CheckBoxs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline 
{

	@When("Click on {string} in checkboxes.")
	public void click_on_in_checkboxes(String checkbox) 
	{
	
		CheckBoxs b= new CheckBoxs();
		b.SelectOption(checkbox);
		
	}
	
	@Then("verify output.")
	public void verify_output() 
	{
	    System.out.println("Checkbox is selected");
	}
	
}
