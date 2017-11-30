package cucumber.poc.stepDefs;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


    @Given("^My Driver in Test1 is$")
    public void driverIs() throws Throwable {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println(driver);
        System.out.println("Plugin Name:" + System.getProperty("PluginName"));

        driver.quit();
    }
}
