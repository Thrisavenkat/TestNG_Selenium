package comCucumberStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample11 {
	@Given("The user is in Login form")
	public void f1() {
		 System.out.println("The user is in Login form");
	}
	@When("The user enters {string} in username field")
	public void f2(String username) {
		 System.out.println(username);
	}
	@And("The user enters {string} in password field")
	public void f3(String password) {
		 System.out.println(password);
	}
	@And("The user clicks on Login button")
	public void f4() {
		 System.out.println("The user clicks on Login button");
	}
	@Then("The user get the {string} message as status")
	public void f5(String status) {
		 System.out.println(status);
	}
}
//@Given("I want to write a step with {string}")
//public void Sample(String name) {
// System.out.println(name);
//}
//@When("I want to enter {int} id as idnum")
//public void sample11(int idnum) {
// System.out.println(idnum);
//}
//@And("I want to enter {double} as salary")
//public void sample12(double salary) {
// System.out.println(salary);
//}