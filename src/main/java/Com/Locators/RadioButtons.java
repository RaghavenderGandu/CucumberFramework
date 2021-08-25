package Com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.TestBase;


public class RadioButtons extends TestBase
{

	@FindBy(xpath="//input[@value='radio1']")
	WebElement Radio1;
	
	@FindBy(xpath="//input[@value='radio2']")
	WebElement Radio2;
	
	@FindBy(xpath="//input[@value='radio3']")
	WebElement Radio3;
	
	//Initializing the page object :
			public RadioButtons()
			{
				PageFactory.initElements(driver, this);
				
			}
			
			public RadioButtons ClickOnRadioButton(String radio)
			{
				if(radio.equals("Radio1"))
				{
					Radio1.click();
				}
				else if(radio.equals("Radio2"))
				{
					Radio2.click();
				}
				else
				{
					Radio3.click();
				}
				
				//Radio1.click();
				 			
				return new RadioButtons();
			}


//			public RadioButtons ClickOnRadio2()
//			{
//				
//				Radio2.click();
//				 			
//				return new RadioButtons();
//			}
//			
//			public RadioButtons ClickOnRadio3()
//			{
//				
//				Radio3.click();
//				 			
//				return new RadioButtons();
//			}
	
	
}
