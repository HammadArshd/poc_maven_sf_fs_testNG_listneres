package cucumber.poc.stepDefs;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

    @Given("^My Driver in Test2 is$")
    public void driverForChromeIs() throws Throwable {
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        System.out.println(driver);
        System.out.println("Plugin Name:" + System.getProperty("PluginName"));
        driver.quit();
    }
}
