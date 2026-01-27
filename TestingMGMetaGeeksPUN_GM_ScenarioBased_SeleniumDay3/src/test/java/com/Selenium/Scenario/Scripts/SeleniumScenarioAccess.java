package com.Selenium.Scenario.Scripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Selenium.Scenarios.seleniumScenario;

public class SeleniumScenarioAccess {
  WebDriver driver 	= new FirefoxDriver();
  seleniumScenario ssc= new seleniumScenario();
//  @Test
//  public void f() throws InterruptedException {
//	  ssc.init(driver);
//	  List<String> FinalOptions=ssc.searchTable();
//	  System.out.println(FinalOptions);
//  }

//  @Test
//  public void f() throws InterruptedException {
//	  ssc.init(driver);
//	  List<WebElement> FinalOptions=ssc. SelectDropDown1();
//	  System.out.println(FinalOptions);
//  
//}
//  @Test
//  public void f() throws InterruptedException {
//	 ssc.init(driver);
//	 ssc.SelectDropDown1();
//   
//}
//  @Test
//  public void ExtractAlert() throws InterruptedException {
//	  ssc.init(driver);
//	 String ac= ssc.HandleAlert_Message();
//	  System.out.println(ac);
//  }
  @Test
  public void DragAndDrop() throws InterruptedException {
  	  driver.get("https://jqueryui.com/droppable/");
  	  Thread.sleep(2000);
  	  driver.switchTo().frame(0);
  	  WebElement drag = driver.findElement(By.id("draggable"));
  	  WebElement drop = driver.findElement(By.id("droppable"));
  	  Actions act= new Actions(driver);
  	  Thread.sleep(2000);
  	 act.dragAndDrop(drag, drop).perform();

  	//Assert.assertEquals("dropped", driver.findElement(By.id("drop-status")).getText());

  }
 
}