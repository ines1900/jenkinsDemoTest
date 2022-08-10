package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/CreationCompte.feature", 
		glue= {"StepsDef"},
		strict=true, 
		monochrome=true,
		tags= {"@TEST_TALAC-805"},
		plugin = {"pretty","json:target/JSONReports/report.json","html:target/HtmlReports"}
		)
public class Runner {

}
