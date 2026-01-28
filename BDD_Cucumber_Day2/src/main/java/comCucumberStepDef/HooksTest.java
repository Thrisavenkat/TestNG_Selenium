package comCucumberStepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksTest {
	@Before
	public void testBefore() {
		System.out.println("Before test");
	}
	@After
    public void testAfter() {
		System.out.println("After test");
	}
	@Before("@tag6 or @tag3")
	public void BeforeWithTag() {
		System.out.println("Before with tag");
	}
	@After("@tag6 or @tag3")
	public void AfterWithTag() {
		System.out.println("after with tag");
	}
	@Before("@tag6 and not @tag3")
	public void BeforeNot() {
		System.out.println("Invalid");
	}
	@After("@tag6 and not @tag3")
	public void AfterNot() {
		System.out.println("Invalid");
	}
	@BeforeStep
	public void BeforeStepTest() {
		System.out.println("Before Each steps");
	}
	@AfterStep
	public void AfterStepTest() {
		System.out.println("After Each steps");
	}
}
