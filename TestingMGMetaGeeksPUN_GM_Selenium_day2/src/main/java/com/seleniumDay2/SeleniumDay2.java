package com.seleniumDay2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class SeleniumDay2 {
    WebDriver driver;
    public void init(WebDriver driver) {
    	this.driver=driver;
    }
    public String launch0_cartLogin() {
    	driver.get("https://awesomeqa.com/ui/index.php?route=account/account");
    	String LoginPageTitle =driver.getTitle();
    	return LoginPageTitle;
    	
    }                                                                                          
    public String PerformLoginValid(String email,String password) throws InterruptedException {
    	driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys(email);
 //driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("thrisavenkat@gmail.com");
    	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	
    	String confirmation_message = driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
    	
    	Thread.sleep(4000);
    	Actions act= new Actions(driver);
    	WebElement el = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/i"));
    	act.moveToElement(el).click().build().perform();
    	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
    	return confirmation_message;
    }
    	
    public String PerformLoginInvalid(String email,String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	String message= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		return message;
   
    }
}
