package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/Features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:reports/cucumber-reports.html",
                "json:reports/cucumber-reports/cucumber.json",
                "junit:reports/cucumber-reports/cucumber.xml"
        },
        monochrome = true
)
public class Testrunner extends AbstractTestNGCucumberTests {
}
