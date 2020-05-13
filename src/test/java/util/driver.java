package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
    private static WebDriver driver;

    private driver(){
    }

    public static WebDriver getDriver(){
        if (driver==null){
            String browser = configurationReader.getData("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }

    public static void tearDown(){
        if (driver!=null){
            driver.close();
            driver = null;
        }
    }

}
