package com.curaHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class curaMakeApp {
	WebDriver driver;
	//init
 public void curaPage1_init(WebDriver driver) {
	 this.driver=driver;
 }
 
 By option=By.xpath("/html/body/section/div/div/form/div[1]/div/select/option[2]");
 By prog=By.id("radio_program_medicaid");
 By Date1= By.xpath("//div[@class='input-group-addon']");
 public void appForm() {
	
	 driver.findElement(option);
	 driver.findElement(prog);
     driver.findElement(Date1).click();
 }
 

}
