package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// Associates Cucumber-JVM with the JUnit runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        glue = {"stepdefs"},
        monochrome = true
)
public class RunCukesTest {

}
