package Com.Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;

public class MouseHover extends TestBase
{

	@FindBy(xpath="//button[@id='mousehover']")
	WebElement Mouse;
	
	public MouseHover()
	{
		PageFactory.initElements(driver, this);
	}
	
	Actions act = new Actions(driver);
	
	
	
	public MouseHover ClickOnTop()
	{
		
		act.moveToElement(Mouse);
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		
		return new MouseHover();
		
	}
	
}
