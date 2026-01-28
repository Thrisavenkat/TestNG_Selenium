package com.curaHerokuApp;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class curaPage11 {
WebDriver driver;
FileReader fr;
Properties p = new Properties();
//Locators
By mkappform=By.xpath("//h2[contains(text(),'Make Appointment')]");
By uname=By.id("txt-username");
By pwd=By.id("txt-password");
By login=By.id("btn-login");
public void init_cura11(WebDriver driver) {
	this.driver=driver;
}
public void Enter_Name_Login() throws IOException {
	String path1="C:\\Users\\nagathrisa.v\\eclipse-workspace\\TestingMGMetaGeeksPUN_GM_SeleniumDay4\\TestData\\data1.properties";
	fr= new FileReader(path1);
	p.load(fr);
	System.out.println("value of p is:"+p);
//	driver.findElement(uname).sendKeys("John Doe");
//	driver.findElement(pwd).sendKeys("ThisIsNotAPassword");
	driver.findElement(uname).sendKeys(p.getProperty("username1"));
	driver.findElement(pwd).sendKeys(p.getProperty("password1"));
	System.out.println(p.getProperty("username1"));
	System.out.println(p.getProperty("password1"));
}
public void clickLogin() {
	 driver.findElement(login).click();
}

}
