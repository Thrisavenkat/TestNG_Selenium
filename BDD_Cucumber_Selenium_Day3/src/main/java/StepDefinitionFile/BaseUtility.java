package StepDefinitionFile;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	WebDriver driver;
  public void maximizeBrowser(WebDriver driver) {
	  driver.manage().window().maximize();
  }     
  public void navigateForward(WebDriver driver) {
	  driver.navigate().forward();
  }
  public void navigateBackward(WebDriver driver) {
	  driver.navigate().back();
  }
  public void refresh(WebDriver driver) {
	  driver.navigate().refresh();
  }
  public void deleteCookies(WebDriver driver) {
	  driver.manage().deleteAllCookies();
  }
  public void scrollDown(WebDriver driver,int val) {
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,val);");
  }
  public void closeBrowser(WebDriver driver) {
	  driver.close();
  }
  public void quitBrowser(WebDriver driver) {
	   driver.quit();
  }
  public void staticWait(WebDriver driver,int time) throws InterruptedException {
	  Thread.sleep(time);
  }
  public void implicitWait(WebDriver driver,int time) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
  }
  public void explicitWait(WebDriver driver,int time) {
	  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
  }
}
