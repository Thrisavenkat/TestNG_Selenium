package com.seleniumDay2_Scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import com.seleniumDay2.SeleniumDay2;
public class SeleniumDay2_Scripts {
	
	//class Objects
	WebDriver driver= new ChromeDriver();
	SeleniumDay2 sd2= new SeleniumDay2();
	//Expected 
	String exp="My Account";
	
	
  @Test(priority=1)
  public void Test_Login_Validate() throws InterruptedException{
	  sd2.init(driver);
	  sd2.launch0_cartLogin();
	  Thread.sleep(2000);
	  String ActStr= sd2.PerformLoginValid("gayatrimis2@gmail.com","gayatrimis2@gmail.com");
	  Thread.sleep(4000);
	  System.out.println(ActStr);
	  Thread.sleep(4000);
//	  Assert.assertEquals(exp, ActStr);
  }
 
}
