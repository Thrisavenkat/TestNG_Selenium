package com.seleniumday2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SeleniumDay1 {
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	// to invoke app
	public void invokeAwesomeApp() {
		driver.get("https://www.awesomeqa.com/ui");
	}
	//EXtract the page title
	public String AwesomeHome_PageTitle() {
		String pgTitleHome= driver.getTitle();
		return pgTitleHome;
	}
	//county all links and extract the names
	public List Count_links_from_Homepage() throws InterruptedException {
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		int LinkCounts=Links.size();
		
		Thread.sleep(3000);
		//Webscrap
		for(int i=1;i<LinkCounts;i++) {
			String Link_names=Links.get(i).getText();
			Thread.sleep(200);
			System.out.println(Link_names);
		}
		
		return Links;
	}
}
