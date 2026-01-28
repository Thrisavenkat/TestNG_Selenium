package com.access.seleniumday1_lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.seleniumday2.SeleniumDay1;
import com.seleniumday2.SeleniumDay1_commonMethods;

public class Navigation_Test {
	WebDriver driver= new ChromeDriver();
	//object
	SeleniumDay1 pg1= new SeleniumDay1();
	SeleniumDay1_commonMethods sdc= new SeleniumDay1_commonMethods();
	
  @Test
  public void NavigateBackTest() throws InterruptedException{
	  pg1.init(driver);;
	  pg1.invokeAwesomeApp();
	  sdc.init0(driver);
	  //Thread.sleep(2000);
	  sdc.navigate_Back();
  }
}
