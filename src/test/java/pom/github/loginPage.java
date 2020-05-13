package pom.github;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.driver;

public class loginPage {
    public loginPage(){
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy (id = "login_field")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (name = "commit")
    public WebElement loginBtn;

    public static void loginProcess(String username, String password){
        loginPage lp = new loginPage();
        lp.username.sendKeys(username);
        lp.password.sendKeys(password);
        lp.loginBtn.click();
    }


}
