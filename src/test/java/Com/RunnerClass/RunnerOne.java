package Com.RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerOne 
{

//@Runwith(CucumberOptions.class)
@CucumberOptions(features= {"src/test/resources/Featurefiles/Checkbox.feature"},glue= {"Com.StepDefinition"}
				
				,monochrome=true)

public class Runner extends AbstractTestNGCucumberTests
{
	
}
	
}
