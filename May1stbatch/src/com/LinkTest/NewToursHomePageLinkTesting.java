package com.LinkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursHomePageLinkTesting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://newtours.demoaut.com";
		driver.get(url);
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links on the New Tours Home Page are: "+Links.size());
		
		for(int i=0;i<Links.size();i++)
		{
			String LinkName=Links.get(i).getText();
			System.out.println("The name of the link is: "+LinkName);
			
			Links.get(i).click();
			System.out.println("The current url is: "+driver.getCurrentUrl());
			System.out.println("The title of the page is: "+driver.getTitle());
			System.out.println(" ");
			driver.navigate().back();
			Links=driver.findElements(By.tagName("a"));
		
			
		}
		
		driver.quit();
	}

}
