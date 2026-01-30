package StepDefinitionFile;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class page {
   WebDriver driver;
   private String[] InvokeBrowser() throws IOException {
   	String[] browser= new String[3];
   	String path1="C:/Users/nagathrisa.v/eclipse-workspace/BDD_Cucumber_Selenium_Day3/TestData/data1.properties";
   	FileReader fr= new FileReader(path1);
   	Properties p = new Properties();
   	p.load(fr);
   	    browser[0]= p.getProperty("Browser");
		browser[1]= p.getProperty("Browser1");
		browser[2]= p.getProperty("Browser2");
		return browser;
	}
   public WebDriver setup() throws IOException {
   	
   	String[] browser =InvokeBrowser();
   	for(int i=0;i<browser.length;i++) {
   	if(browser[i].equalsIgnoreCase("Chrome")) {
   		driver= new ChromeDriver();
   	}
   	else if(browser[i].equalsIgnoreCase("Edge")) {
   		driver = new EdgeDriver();
   	}
   	else if(browser[i].equalsIgnoreCase("FireFox")) {
   		driver= new FirefoxDriver();
   	}
   	}
   	return driver;
   	}
   public void LaunchApp() {
	 String baseURL = "https://www.bookswagon.com/login?q=signup";
	 driver.get(baseURL);
   }
   public void enterDetails() throws IOException {
	   
	   String filePath = "C:/Users/nagathrisa.v/eclipse-workspace/BDD_Cucumber_Selenium_Day3/src/Examples.xlsx";
       String sheetName = "Sheet1";

       int rowCount = ExcelUtil.getRowCount(filePath, sheetName);
       for (int i = 1; i <= rowCount; i++) {

           String name = ExcelUtil.getCellData(filePath, sheetName, i, 0);
           String phone = ExcelUtil.getCellData(filePath, sheetName, i, 1);

           driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtName']")).clear();
           driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtName']")).sendKeys(name);
  
           driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).clear();
           driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).sendKeys(phone);          
       }
   }
   public void clickbtn() {
   driver.findElement(
           By.xpath("//input[@name='ctl00$phBody$SignUp$btnContinue']"))
           .click();
}
}
	

 