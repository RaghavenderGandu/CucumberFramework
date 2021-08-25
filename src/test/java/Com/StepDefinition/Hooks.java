package Com.StepDefinition;

import Com.TestBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase
{

	@Before
	public void Title()
	{
		System.out.println("Hooks-before");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Hooks-After");
		//driver.quit();
	}
	
}
