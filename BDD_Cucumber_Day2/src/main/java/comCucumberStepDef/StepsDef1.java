package comCucumberStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDef1 {
	//Background
	@Given("a global administrator named greg")
	public void presetup() {
		System.out.println("Background");
	}
	@Given("I am holding the calculator")
	public void step1() {
		System.out.println("I am holding the calculator");
	}
    @When("I enter the first number")
    public void step2() {
    	System.out.println("I enter the first number");
    }
    @And("I click on + symbol")
    public void step3() {
    	System.out.println("I click on + symbol");
    }
    @And("I click on the second number")
    public void step4() {
    	System.out.println("I click on the second number");
    }
    @Then("I must be able to view the sum of the numbers")
    public void step5() {
    	System.out.println("I must be able to view the sum of the numbers");
    }
    @Given("I am in registration form")
    public void given_test() {
    	System.out.println("I am in registration form");
    }
    @When("I enter my firstname")
    public void text() {
    	System.out.println("I enter my firstname");
    }
}

