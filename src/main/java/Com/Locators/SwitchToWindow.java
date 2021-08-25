 	package Com.Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;

public class SwitchToWindow extends TestBase
{

	@FindBy(xpath="//*[@id='openwindow']")
	WebElement OpenWindow;
	
	public SwitchToWindow()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CheckBoxs ClickOnOpenWindow()
	{
		if(OpenWindow.isDisplayed())
		{
		   OpenWindow.click();
		}
		
		return new CheckBoxs();
	}
	
	public CheckBoxs ClickOnCourse()
	{
		String parentwindow=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
			
			driver.switchTo().window(childwindow);
			
			WebElement course= driver.findElement(By.xpath("//a[text()='Courses']"));
			
			if(course.isDisplayed())
			{
				course.click();
			}
			
			}
		}
	
		
		return new CheckBoxs();
	}
	
	String parent= driver.getWindowHandle();
	Set<String> s= driver.getWindowHandles();
	Iterator<String>itr=s.iterator();
	
	if(itr.hasNext())
	{
		String child = itr.next();
		
	}
	
	
	
}
