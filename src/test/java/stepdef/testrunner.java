package stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
        monochrome = true,
        dryRun = false,
        plugin = {
//                "pretty","html:target/reports.html"
        		
        		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAda"
        }
        )

public class testrunner extends AbstractTestNGCucumberTests 
{
	
}	


