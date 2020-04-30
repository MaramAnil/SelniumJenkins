package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, glue = { "stepDefinations" }, monochrome = true, dryRun = false, plugin = {
		"html:target/Cucumber-html-report", "json:target/Cucumber-json-report.json" })
public class Runner {

}
