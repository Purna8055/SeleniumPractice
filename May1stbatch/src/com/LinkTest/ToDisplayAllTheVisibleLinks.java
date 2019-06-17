package com.LinkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToDisplayAllTheVisibleLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url="https://opensource-demo.orangehrmlive.com";
		driver.get(url);
		

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<Links.size();i++)
			if(Links.get(i).isDisplayed())
			{String LinkName=Links.get(i).getText();
			 System.out.println(LinkName);	
			}
		driver.quit();
	}

}
