package Com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.TestBase.TestBase;

public class DropDown extends TestBase
{

	@FindBy(xpath="//*[@id='dropdown-class-example']")
	WebElement dropdown;
	
	public DropDown()
	{
		PageFactory.initElements(driver, this);
	}
	
	public DropDown SelectDropdown(String value)
	{
				
				
		//WebElement e=dropdown.click();
		
		List<WebElement> lst= dropdown.findElements(By.tagName("option"));
		
		lst.get
		
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getText().equals(value))
			{
				lst.get(i).click();
			}
		} 
		
		return new DropDown();
		
	}
	
}
