package Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles",
glue = {"StepDefination"},
monochrome = true,
//tags= "@get",
//tags = "@post",
//tags = "@get1",
//tags = "@user",
//tags = "@negativeScenario",
//tags = "@future",
//tags = "@Test",

plugin = {
//"pretty", "html:target/reports/index.html",
//"pretty", "json:target/reports/cucumber.json",
//"pretty", "junit:target/reports/cucumber.xml",
//"pretty", "testng:target/reports/cucumber.xml"
}
)





public class TestRunnerAndTestReports {





}