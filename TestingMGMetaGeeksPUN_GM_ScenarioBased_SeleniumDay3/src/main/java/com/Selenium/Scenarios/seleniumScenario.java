package com.Selenium.Scenarios;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class seleniumScenario {
WebDriver driver;

public void init(WebDriver driver) {
	this.driver=driver;
}
//public List<String> searchOptions() throws InterruptedException{
//	driver.get("https://www.google.com");
//	Thread.sleep(2000);
//	driver.findElement(By.name("q")).sendKeys("Test automation");
//	Thread.sleep(2000);
//	
//	List <WebElement> options =driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));
//	List<String> resultOptions=new ArrayList();
//	for(int i=0;i<options.size();i++) {
//		Thread.sleep(300);
//		String result= options.get(i).getText();
//		System.out.println(result);
//		resultOptions.add(result);
//	}
//	return resultOptions;
//}
//public List<String> searchTable() throws InterruptedException{
//	driver.get("https://www.w3schools.com/html/html_tables.asp");
//	Thread.sleep(2000);
//	
//	List<WebElement> op=driver.findElements(By.xpath("//table[@id='customers']//tr"));
//	List<String> res=new ArrayList();
//	for(int i=0;i<op.size();i++) {
//		Thread.sleep(300);
//		String result1= op.get(i).getText();
//		System.out.println(result1);
//		res.add(result1);
//	}
//	return res;
//	
//}
//public String ColumnValidate() {
//	driver.get("https://www.w3schools.com/html/html_tables.asp");
//	List<WebElement> out = driver.findElements(By.xpath("//table//tr[1]"));
//	
//	return out;	
//}
//public List <WebElement> SelectDropDown() throws InterruptedException{
//	driver.get("https://www.amazon.in/");
//	Thread.sleep(4000);
//	WebElement data= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//	Select sel= new Select((WebElement) data);
//	Thread.sleep(2000);
//	sel.selectByIndex(3);
//	sel.selectByContainsVisibleText("Baby");
//	List<WebElement> myList =sel.getOptions();
//	for(int i=0;i<myList.size();i++) {
//		Thread.sleep(2000);
//		String Options = myList.get(i).getText();
//		System.out.println(Options);
//	}
//                                                                                                                           
//	return myList;
//}
//public void SelectDropDown1() throws InterruptedException{
//	driver.get("https://demo.guru99.com/test/newtours/register.php");
//	Thread.sleep(4000);
//	WebElement data= driver.findElement(By.name("country"));
//	Select seltest= new Select((WebElement) data);
//	Thread.sleep(2000);
//    seltest.selectByIndex(7);
//}
//public String HandleAlert_Message() throws InterruptedException {
//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//	Thread.sleep(3000);
//		
//	WebElement unm= driver.findElement(By.name("login"));
//	WebElement pwd=driver.findElement(By.id("password"));
//	WebElement sub= driver.findElement(By.xpath("//button[@type='submit']"));
//	Thread.sleep(2000);
//	driver.findElement(By.name("login")).sendKeys("testdata1");
//	sub.click();
//	Alert act=driver.switchTo().alert();
//	String actAlertMsg = act.getText();
//	Thread.sleep(2000);
//	act.accept();
//	unm.sendKeys("data");
//    return actAlertMsg;
//}

}