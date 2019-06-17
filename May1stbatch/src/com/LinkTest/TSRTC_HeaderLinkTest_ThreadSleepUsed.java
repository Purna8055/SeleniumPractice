package com.LinkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderLinkTest_ThreadSleepUsed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "http://tsrtconline.in/oprs-web/";
		driver.get(url);
		
		WebElement Header=driver.findElement(By.className("menu-wrap"));
		List<WebElement>HeaderLinks=Header.findElements(By.tagName("a"));
		
		int HeaderLinksCnt=HeaderLinks.size();
		System.out.println("The total number of links in the Header are: "+HeaderLinksCnt);
		
		for(int i=0;i<HeaderLinksCnt;i++)
		{   if(i==3)
		     { continue;    }
			String LinkName=HeaderLinks.get(i).getText();
			System.out.println(LinkName+":"+"Tested successfully");
			System.out.println("The current url is:"+driver.getCurrentUrl());
			System.out.println(" ");
			
			HeaderLinks.get(i).click();
			Thread.sleep(5000);
			
			driver.navigate().back();
			Header=driver.findElement(By.className("menu-wrap"));
			HeaderLinks=Header.findElements(By.tagName("a"));
		}
		driver.quit();

	}

}
