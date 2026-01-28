package com.selenium.cura.scripts;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.curaHerokuApp.curaPage1;
import com.curaHerokuApp.curaPage11;
import com.curaHerokuApp.curaMakeApp;
public class TestScripts001 {
WebDriver driver= new ChromeDriver();
curaPage1 cpage1=new curaPage1();
//curaPage2 cpage2=new curaPage2();
curaPage11 cpage11= new curaPage11();
curaMakeApp capp= new curaMakeApp();
@Test(priority=1)
public void InvokeApp() {
	cpage1.curaPage1_init(driver);
	String ValidateLaunch= cpage1.LaunchApp("https://katalon-demo-cura.herokuapp.com/");
}
@Test(priority=2)
public void Click_Make_Appointment() {
	cpage1.ClickOnMakeAppoinment();
}
@Test(priority=2)
	public void PerformLogin() throws IOException {
		cpage11.init_cura11(driver);
		cpage11.Enter_Name_Login();
		cpage11.clickLogin();
	}
@Test(priority=3)
public void MakeAppoinment() {
	    capp.appForm(); 
}
}

