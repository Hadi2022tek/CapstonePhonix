package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "src/test/resources/features",
	glue = "stepDefinitions",
	// we can use and or to add multiple or some of the tags
	tags = "@desktops",
	dryRun = false,
	strict = true,
	monochrome = true,
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)
	
public class Runner {
		
		@AfterClass
		public static void generateReport() {
			CucumberReportingConfig.reportConfig();
		}
}
