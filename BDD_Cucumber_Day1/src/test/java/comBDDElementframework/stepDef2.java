package comBDDElementframework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDef2 {
 
	    @Given("I want to write a step with precondition")
	    public void method1() {
	    	System.out.println("I want to write a step with precondition");
	    }
	    @And("some other precondition")
	    public void method2() {
	    	System.out.println("some other precondition");
	    }
	    @When("I complete action")
	    public void method3() {
	    	System.out.println("I complete action");
	    }
}
