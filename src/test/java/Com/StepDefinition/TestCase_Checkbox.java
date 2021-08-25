package Com.StepDefinition;

import Com.Locators.CheckBoxs;

import Com.Locators.SwitchToTab;
import Com.Locators.SwitchToWindow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_Checkbox
{

	CheckBoxs boxes=new CheckBoxs();
	SwitchToWindow window = new SwitchToWindow();
	
	@Given("click on {string} in checkbox option.")
	public void click_on_in_checkbox_option(String checkbox) 
	{
	    boxes.SelectOption(checkbox);
	}

	@Then("send checkbox output.")
	public void send_checkbox_output() 
	{
	   System.out.println("selected sucessfully"); 
	}

	@When("Click on switchto window button .")
	public void click_on_switchto_window_button()
	{
	   window.ClickOnOpenWindow();
	   
	}

	@When("Click on course link.")
	public void click_on_course_link() 
	{
		window.ClickOnCourse();
	}

	@Then("send switchto window output.")
	public void send_switchto_window_output()
	{
	    System.out.println("Switched to window");
	}

	SwitchToTab tab = new SwitchToTab();
	
	@When("Click on switchto Tab button .")
	public void click_on_switchto_tab_button() 
	{
	   tab.ClickOnOpenTab();
	}

	@When("Click on course link in new tab.")
	public void click_on_course_link_in_new_tab() 
	{
	    tab.ClickOnOpenWindow();
	}

	@Then("send switchto tab output.")
	public void send_switchto_tab_output() 
	{
	    System.out.println("Switched to tab");
	}

	
}
