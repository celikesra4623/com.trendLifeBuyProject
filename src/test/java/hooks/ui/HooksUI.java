package hooks.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class HooksUI {


    @Before("@UI")
    public void beforeScenario() {
        Driver.getDriver();
    }

    @After("@API")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }
    }

    @After(order = 1)
    public void afterScenario() {
        //ReusableMethods.wait(180);
        Driver.closeDriver();
    }
}
