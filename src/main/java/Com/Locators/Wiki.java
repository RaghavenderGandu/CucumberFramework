package Com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wiki 
{

WebDriver driver;
	
	// write your script here.
	By LoginTab=By.xpath("//a[text()='Log in']");
  By username=By.xpath("//input[@id='wpName1']");
  By password=By.xpath("//input[@id='wpPassword1']");
  By logIn=By.xpath("//button[@id='wpLoginAttempt']");
	
	
	
	public Wiki(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginTab(){
		
		driver.findElement(LoginTab).click();
	}
	
	public void typeUserName(){
		
		driver.findElement(username).sendKeys("Raghav179461");
	}
	
	public void typePassword(){
		
		driver.findElement(password).sendKeys("Password.1");
	}
	
	public void clickLoginButton(){
	
		driver.findElement(logIn).click();
		
	}
	
}
	
	

