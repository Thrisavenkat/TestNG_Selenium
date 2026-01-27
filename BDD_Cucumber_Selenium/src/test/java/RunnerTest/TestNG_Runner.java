package RunnerTest;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
   @CucumberOptions(features= {"src/test/java/CucumberFeatureFile/"},
	glue="StepDefinitionPackage",
	tags="@tag1",
	plugin={
			"html:target/cucumber-reports/Cucumber.html",
			"json:target/cucumber-reports/CucumberTestReport.json",
			"junit:target/cucumber-reports/CucumberXML.xml"
	}
	)
	public class TestNG_Runner extends AbstractTestNGCucumberTests {
		
	}
