p}ackage Com.TestBase;
+{_?p0o9ij8u

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader 
{

	public Properties getProperty() throws IOException
	{
		//FileInputStream inputStream=null;
        Properties properties = new Properties();
        try {        	 
            properties.load(new FileInputStream("C:\\Users\\Raghavendar Gandu\\eclipse-workspace\\CucumberAutomation\\src\\main\\java\\Com\\PropertyFile\\Property_One"));
          //  properties.load(new FileInputStream("resources/testdata-config.properties"));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
       } 
         return properties;	
	}
	
}
