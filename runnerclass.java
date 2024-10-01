package Hotels.Runner_Class;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resource/features/file.feature",
    glue = {"hotels_stepdefinition"},
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class runnerclass extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setUp() {
        // Setup code if needed
    }

    @AfterClass
    public void tearDown() {
        // Teardown code if needed
    }

    @Test
    public void runCucumber() {
        // This method will be empty, Cucumber will handle the execution
    }
}
