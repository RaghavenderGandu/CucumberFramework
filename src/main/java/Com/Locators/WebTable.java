package Com.Locators;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;

public class WebTable extends TestBase
{

	@FindBy(xpath="//table[@name='courses']")
	WebElement table;
	
	public WebTable()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public WebTable SelectTableDetails (int num1,int num2)
	{
		
		List<WebElement> row=table.findElements(By.tagName("tr"));
		//System.out.println(row.size());
		
		List<WebElement> column=table.findElements(By.tagName("th"));
		//System.out.println(column.size());
		
		
		for(int i=2;i<=row.size();i++)
		{
			for(int j=1;j<=column.size();j++)
			{
				WebElement abc=driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+ num1 +"]/td["+ num2 +"]"));
				
				System.out.println(abc.getText());
			}
		}
			
			
		return new WebTable();
		
	}
	
}
