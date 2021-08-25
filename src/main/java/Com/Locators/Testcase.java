package Com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Com.Locators.*;

public class Testcase 
{
	
		@Test
		public void verifyLogin() throws InterruptedException{
			

			
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//System.out.println("PhantomJS Headless Driver launched");
			driver.get("https://www.facebook.com/");
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9700179461");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password.1");
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			
		}
	}
	
