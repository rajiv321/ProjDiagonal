package stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:target/reports.html"
        }
        )

public class testrunner extends AbstractTestNGCucumberTests 
{
	
}	


