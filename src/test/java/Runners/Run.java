package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/loginTest.feature",
        glue = {"stepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {

}
