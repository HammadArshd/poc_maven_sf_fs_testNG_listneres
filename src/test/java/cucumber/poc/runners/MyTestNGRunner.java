package cucumber.poc.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(strict = true, features = {"src/test/resources/features"}, glue = {"cucumber.poc.stepDefs"},
        plugin = {"pretty",
                "html:target/cucumber-pretty/chrome",
                "json:target/cucumber-json/chrome/cucumber.json"},
        monochrome = true
)

public class MyTestNGRunner extends AbstractTestNGCucumberTests{

}