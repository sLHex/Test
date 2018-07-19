package Temp2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * This class is in charge of running the tests and setting up how the report should be formatted
 * features: the location of the feature files in cucumber i.e in src/test/resource from the root of this project
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/OldSchoolRunescapeSmokeTest.feature"},
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class OldSchoolRunescapeSmokeTestRunner {

}