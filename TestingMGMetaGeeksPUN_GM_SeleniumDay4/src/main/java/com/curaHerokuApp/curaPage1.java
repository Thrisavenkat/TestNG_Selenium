package com.curaHerokuApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class curaPage1 {
	WebDriver driver;
	//init
 public void curaPage1_init(WebDriver driver) {
	 this.driver=driver;
 }
 //locators
 By validatePage1=By.xpath("//*[contains(text(),'We Care About Your Health')]");
 By mkap = By.id("btn-make-appointment");
 By mkappform = By.xpath("//h2[contains(text(),'Make Appointment')]");
 
 //automation steps methods
 public String LaunchApp(String BaseURL) {
	 driver.get(BaseURL);
	 String val1="The App is Launched Successfully";
	 String val2="Check the URL";
	 if(driver.findElement(mkap).isDisplayed()) {
		 return val1;
	 }
	 else {
		 return val2;
	 }
 }
 
 public void ClickOnMakeAppoinment() {
	 driver.findElement(mkap).click();
	 String mkaptext= driver.findElement(mkappform).getText();
	 
	// return mkaptext;
 }

}
