package com.access.seleniumday1_lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.seleniumday2.SeleniumDay1;
import com.seleniumday2.SeleniumDay1_commonMethods;

public class DataExtractionTest {
	WebDriver driver= new ChromeDriver();
	
	//create object
	SeleniumDay1 sdl1= new SeleniumDay1();
	SeleniumDay1_commonMethods scm1 = new SeleniumDay1_commonMethods();
  @Test(priority=1)
  public void ExtractPageContent() {
	  sdl1.init(driver);
	  sdl1.invokeAwesomeApp();
	  scm1.init0(driver);
	  String pgsource=scm1.Extract_PageSource();
	  System.out.println(pgsource);
  }
}
    