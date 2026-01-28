package com.seleniumday2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase001 {
	public static void main(String args[]) {
		WebDriver driver= new ChromeDriver();
		//invoke the app
		driver.get("https://www.awesomeqa.com/ui");
		//validate
		String pgTitle1 = driver.getTitle();
		
		System.out.println(pgTitle1);
	}
}
