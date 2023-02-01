package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//src//test//resources//mobilesearch"},
		dryRun = true,
		glue="cucumber",
		tags= {"@~smoke,@sanity"},
		snippets=SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"html:target","json:target/reports.json"}
		
		)
public class TestRunner {

}
