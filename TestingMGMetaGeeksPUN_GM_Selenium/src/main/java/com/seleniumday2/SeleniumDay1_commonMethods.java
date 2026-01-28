package com.seleniumday2;
import org.openqa.selenium.WebDriver;
public class SeleniumDay1_commonMethods {
WebDriver driver;
public void init0(WebDriver driver) {
	this.driver=driver;
}
//Maximize the browser
public void maximize_Browser() {
	driver.manage().window().maximize();
}
//Delete all cookies
public void Delete_Cookies_from_Browser() {
	driver.manage().deleteAllCookies();
}
//Browser Navigation 
public void navigate_Back() {
	driver.navigate().back();
}
//public void navigate_Forward() {
//	driver.navigate().forward();
//}
//public void navigate_Refresh() {
//	driver.navigate().refresh();
//}
//Extract page source
public String Extract_PageSource() {
	String pgs= driver.getPageSource();
	return pgs;
}
}
