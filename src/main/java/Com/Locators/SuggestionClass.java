package Com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.TestBase.TestBase;

public class SuggestionClass extends TestBase
{

	@FindBy(xpath="//*[@id='autocomplete']")
	WebElement Suggestion;
	
	public SuggestionClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SuggestionClass EnterinputAsIndia(String country)
	{
		
		Suggestion.sendKeys(country);
		WebDriverWait wait= new WebDriverWait(driver,10);
	     WebElement india1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + country +"']")));
	     india1.click();
	      		
		return new SuggestionClass();
		
	}
	
}
