package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.github.homePage;
import pom.github.loginPage;
import util.configurationReader;
import util.driver;

public class github_stepDef {
    @When("^user reach the home page of github$")
    public void user_reach_the_home_page_of_github() throws Throwable {
        driver.getDriver().get(configurationReader.getData("url"));
        Thread.sleep(4000);
    }

    // Search term test use
    @Then("^user search \"([^\"]*)\" in the search box$")
    public void user_search_in_the_search_box(String t) throws Throwable {
        homePage.searchTerm(t);
    }

    @Then("^user wait some time before the test finish$")
    public void user_wait_some_time_before_the_test_finish() throws Throwable {
        Thread.sleep(3000);
    }

    // Login test use
    @Then("^user click on Sign In and come to the sign in page$")
    public void user_click_on_Sign_In_and_come_to_the_sign_in_page() throws Throwable {
        homePage hp = new homePage();
        hp.signInTab.click();
        // homePage.signInTab.click();
        Thread.sleep(3000);
    }

    @Then("^user put in the \"([^\"]*)\" and \"([^\"]*)\" and log in$")
    public void user_put_in_the_and_and_log_in(String username, String password) throws Throwable {
        loginPage.loginProcess(username, password);
    }

}
