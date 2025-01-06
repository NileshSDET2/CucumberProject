package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "stepdefinitions", // Path to step definitions
        plugin = {
            "pretty",                            // Console output
            "html:target/cucumber-reports.html", // HTML report
            "json:target/cucumber-reports.json"  // JSON report
        },
        monochrome = true                       // Cleaner console output
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
