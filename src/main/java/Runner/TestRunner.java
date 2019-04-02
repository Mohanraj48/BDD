package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/shareit/Eclipse/ClassicBDD/src/main/java/Features/sample.feature",
		glue={"stepDefinitions"},
		format = {"pretty","html:test-output", "json:Json_output/Cucumber.json","junit:junit_xml/cucumber.xml"},
		dryRun=true,
		monochrome=true,
		strict = true
	//	tags={"~@SmokeTest" , "@RegressionTest"}
		)
public class TestRunner {

}
