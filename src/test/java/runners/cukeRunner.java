package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = "html:target/cucumber",
        glue = "",
        tags = {"@SearchTest, @LoginTest"},
        dryRun = false
)
public class cukeRunner {
}
