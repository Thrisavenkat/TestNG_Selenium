package comCucumberTestRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features= {"src/test/java/comCucumberFeature/"},
glue="comCucumberStepDef",
tags="@tag6 or tag3",
plugin={
		"html:target/cucumber-reports/Cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-reports/CucumberXML.xml"
}
)
public class TestNG_RunnerFile extends AbstractTestNGCucumberTests {
	
}
