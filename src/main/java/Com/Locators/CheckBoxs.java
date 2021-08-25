package Com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;

public class CheckBoxs extends TestBase
{

	@FindBy(id="checkBoxOption1")
	WebElement option1;
	
	@FindBy(id="checkBoxOption2")
	WebElement option2;
	
	@FindBy(id="checkBoxOption3")
	WebElement option3;
	
	public CheckBoxs()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public CheckBoxs SelectOption(String checkbox)
	{
		if(checkbox.equals("Option1"))
		{
			option1.click();
		}
		else if(checkbox.equals("Option2"))
		{
			option2.click();
		}
		else
		{
			option3.click();
		}
		
		
		return new CheckBoxs();
		
	}
	
}
