package Com.Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;

public class SwitchToTab extends TestBase
{

	@FindBy(xpath="//a[@id='opentab']")
	WebElement Opentab;
	
	public SwitchToTab()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SwitchToTab ClickOnOpenWindow()
	{
		if(Opentab.isDisplayed())
		{
		   Opentab.click();
		}
		
		return new SwitchToTab();
	}
	
	public SwitchToTab ClickOnOpenTab()
	{
		String parentwindow=driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
			
			driver.switchTo().window(childwindow);
			
			
			
			System.out.println(driver.getTitle());
			
			
			
			WebElement course= driver.findElement(By.xpath("//*[text()='Courses']"));
			
			if(course.isDisplayed())
			{
				course.click();
			}
			
		}
		
		
	}
		return new SwitchToTab();
}
	
}
