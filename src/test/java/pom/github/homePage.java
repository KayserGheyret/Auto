package pom.github;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.driver;

public class homePage {
    public homePage(){
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy (name = "q")
    public WebElement searchBox;

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement signInTab;

    public static void searchTerm(String term){
        homePage hp = new homePage();
        hp.searchBox.sendKeys(term + Keys.ENTER);
    }
}
