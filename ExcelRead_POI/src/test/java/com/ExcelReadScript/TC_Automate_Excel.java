package com.ExcelReadScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.seleniumDay5.ExcelRead;

public class TC_Automate_Excel {
	
	WebDriver driver= new ChromeDriver();
	ExcelRead obj= new ExcelRead();
  @Test
  public void SearchStringPass_Google() throws IOException {
	  driver.get("https://www.google.com");
	  String testdata = obj.ReadCellData(1,1);
	  driver.findElement(By.name("q")).sendKeys(testdata);
  }
}