package com.ExcelReadScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.seleniumDay5.ExcelRead;

public class Automate_WordToPdf {
	WebDriver driver= new ChromeDriver();
	ExcelRead obj= new ExcelRead();
//  @Test
//  public void Upload() {
//	  driver.get("https://www.pdfgear.com/word-to-pdf/");
//	
//  }
	
	
//keypress herokuapp
@Test(priority=1)
  public void key11() {
	driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.findElement(By.id("target")).sendKeys("hello");
  }
}
