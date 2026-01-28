package com.access.seleniumday1_lib;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.seleniumday2.SeleniumDay1;
import com.seleniumday2.SeleniumDay1_commonMethods;

import junit.framework.Assert;
public class Awesome_TC01 {
WebDriver driver = new ChromeDriver();
//object for library class
SeleniumDay1_commonMethods pg0= new SeleniumDay1_commonMethods();
SeleniumDay1 pg1= new SeleniumDay1();

//Expected Test Data
String exp_homepage="Your Store";

@Test(priority=1)
public void invokeAppAwesome() {
	pg0.init0(driver); 
	pg0.maximize_Browser();
	pg0.Delete_Cookies_from_Browser();
	pg1.init(driver);
	pg1.invokeAwesomeApp();
	String homepage = pg1.AwesomeHome_PageTitle();
	System.out.println("homepage title:"+homepage);
}
@Test(priority=2)
public void Fetch_And_Validate_Title() {
	String homepage = pg1.AwesomeHome_PageTitle();
	System.out.println("homepage title:"+homepage);
	
	//Assertion for validating page 
	Assert.assertEquals(homepage, exp_homepage);
}

@Test(priority=3)
public void Counts_Link_Test() throws InterruptedException {
	List cnt=pg1.Count_links_from_Homepage();
	System.out.println("Total no of links: "+" "+cnt);
	}
}
