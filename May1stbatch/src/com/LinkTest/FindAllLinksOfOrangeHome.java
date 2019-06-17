package com.LinkTest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinksOfOrangeHome {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    
    String url="https://opensource-demo.orangehrmlive.com";
    driver.get(url);
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
    List<WebElement> Links =driver.findElements(By.tagName("a"));
    int Links_Cnt=Links.size();
    System.out.println("The total number of links on the OrangeHRM Home Page are "+Links_Cnt);
    
    for(int i=0;i<Links_Cnt;i++)
    {
    String LinkName=Links.get(i).getText();
    System.out.println("The name of the link is :"+LinkName);
    }
    
    for(int i=0;i<Links_Cnt;i++)
    {
        Links.get(i).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("|");
        driver.navigate().back();
        Links =driver.findElements(By.tagName("a"));
    
    }
   
    driver.quit();
	}



	}
