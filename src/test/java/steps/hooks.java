package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.driver;

public class hooks {
    @Before
    public void startUp(){
        driver.getDriver().manage().window().maximize();
    }

    @After
    public void tear(){
        driver.tearDown();
    }
}
