package Com.Locators;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Com.TestBase.TestBase;

public class Alerts extends TestBase
{

	@FindBy(xpath="//input[@id='alertbtn']")
	WebElement Alert1;
	
	public Alerts()
	{
		PageFactory.initElements(driver, this);
	}
	
	Alert al=driver.switchTo().alert();
	
	public Alerts GetAlertMessage()
	{
		
		if(Alert1.isDisplayed())
		{
			Alert1.click();
			
			System.out.println(al.getText());
		}
		
		return new Alerts();
		
	}
	
	public Alerts AcceptAlert()
	{
		
		if(Alert1.isDisplayed())
		{
			Alert1.click();
			
			al.accept();
		}
		
		return new Alerts();
		
	}
	
	
	
	
}
