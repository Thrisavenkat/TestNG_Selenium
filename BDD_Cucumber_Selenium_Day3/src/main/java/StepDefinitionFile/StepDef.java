package StepDefinitionFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	WebElement signup;
	    @Given("the user must be in chrome browser")
		public void setup() {
			driver= new ChromeDriver();
		}
		@Given("The user in the signup page")
		public void signup_page() {
			driver.manage().window().maximize();
			String BaseURL="https://www.bookswagon.com/login?q=signup";
			driver.get(BaseURL);
			System.out.println("The user in the signup page");
		}
		@When("The user enter {string}")
		public void EnterName(String name) {
			driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtName']")).sendKeys(name);
		}
		@When("The user enter the {string}")
		public void phoneno(String phoneno) {
			driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).sendKeys(phoneno);
		}
		@When("The user click on i am not a robot")
		public void clickRobot() throws InterruptedException {
			//driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
			Thread.sleep(5000);
			
		}
		@And("The user click on continue")
		public void clickContinue() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='ctl00$phBody$SignUp$btnContinue']")).click();
		
		
		}
		@Then("the user will enter in the website")
		public void EnterWebsite() {
			System.out.println("the user will enter in the website");
		}
}
                                               