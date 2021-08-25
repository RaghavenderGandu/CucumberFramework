package Com.TestBase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase 
{

	public static WebDriver driver; 
	//static //public static Properties prop;
	
	static FileReader obj= new FileReader();
	

   
	/*public Testbase_Testbase() {
		//String dir = System.getProperty("user.dir");
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("R:\\Selenium workSpace\\Com.DataUse_Framework\\src\\main\\java\\Datause_Propertyfile\\Datause_propertyfile");
			
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

	} */
	
	public void initialization() throws IOException
	
	{
		Properties properties = obj.getProperty();
		//String browserName = null;
		String Browser = properties.getProperty("Browser");
		
		if (Browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			//WebDriverManager.chromedriver().version("78.0.3904").setup();
			driver = new ChromeDriver();
		} else if (Browser.equals("Firefox")) {
			//WebDriverManager.firefoxdriver().arch64().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(testutill.implicitwait,
		// TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utilities.pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities.Implicitywait, TimeUnit.SECONDS);

		driver.get(properties.getProperty("URL"));
		
	}

	
}
