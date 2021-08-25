package Com.StepDefinition;

import java.io.IOException;

import Com.Locators.DropDown;
import Com.Locators.RadioButtons;
import Com.Locators.SuggestionClass;
import Com.TestBase.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_One 
{
	
	@Given("navigate application.")
	public void navigate_application() throws IOException 
	{
	    TestBase test=new TestBase();
	    test.initialization();
		
	}
	
		
	@When("Radio button is displayed.")
	public void Radio_button_is_displayed() 
	{
		
		System.out.println("radio button is displayed");
	}

	@And("click on {string} option.")
	public void select_RadioBox(String option) 
	{
		RadioButtons radio=new RadioButtons();
		radio.ClickOnRadioButton(option);
	}

	@Then("verify radiobutton is checked or not.")
	public void verify_radiobutton_is_checked_or_not()
	{
		System.out.println("selected");
	    
	}
	
	@When("Enter value as {string} .")
	public void enter_value_as(String india) 
	{
		SuggestionClass sug= new SuggestionClass();
	    sug.EnterinputAsIndia(india);
	}

	@Then("Select value.")
	public void select_value() 
	{
	    
	}
	
	@Then("Select value as {string} .")
	public void select_value_as(String down) 
	{
	    DropDown drop=new DropDown();
	    drop.SelectDropdown(down);
	}
	
	
		
}
