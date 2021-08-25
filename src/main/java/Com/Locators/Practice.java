package Com.Locators;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//input[@name='q']")).sendeys(Keys.ENTER);
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("openwindow")).click();
		
		String parentwindow=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
			
			driver.switchTo().window(childwindow);
			
//			WebElement course= driver.findElement(By.xpath("//a[text()='Courses']"));
//			
//			if(course.isDisplayed())
//			{
//				course.click();
//			}
//			
//			}
			
			WebDriverWait wait= new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='NO THANKS']")));
			Assert.assertEquals(2, 4);
			
			
			
		}
		
	
//      System.setProperty("webdriver.chrome.driver", "E:\\Raghav_Docuemnts\\API\\chromedriver.exe");
//      WebDriver driver= new ChromeDriver();
//      
//  	JavascriptExecutor js=(JavascriptExecutor)driver;
//      
//      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//      driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("ind");
//      
//      WebDriverWait wait= new WebDriverWait(driver,10);
//     WebElement india= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='India']")));
//     india.click();
//     
//     WebElement e= driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
//     
//     List<WebElement> lst= e.findElements(By.tagName("option"));
//		for(int i=0;i<lst.size();i++)
//		{
//			System.out.println(lst.get(i).getText());
//			if(lst.get(i).getText().equals("Option1"))
//			{
//				lst.get(i).click();
//			}
//		} 
//		
//		driver.manage().window().maximize();
//		
//	js.executeScript("window.scrollBy(0,1250)", "");
//		
//		
//	driver.switchTo().frame("courses-iframe");
//	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.xpath("//*[text()='Courses']")).click();
//	
//	
     
   	}
	
}

	private static Object visabilityofelement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
