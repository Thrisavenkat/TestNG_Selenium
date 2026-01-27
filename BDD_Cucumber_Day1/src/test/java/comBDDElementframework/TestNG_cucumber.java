package comBDDElementframework;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features= {"src/test/java/comBDDElementframework/"},
glue="comBDDElementframework",
tags="@tag1",
plugin={
		"html:target/cucumber-reports/Cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json"
}
)
public class TestNG_cucumber extends AbstractTestNGCucumberTests {
	
}
