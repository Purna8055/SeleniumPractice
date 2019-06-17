package com.LinkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    
    String url="http://newtours.demoaut.com";
    driver.get(url);
    
    //<a href="mercurysignon.php?osCsid=dd7dc0c55b81fa7f4374ad41cbdacea7">SIGN-ON</a>
    //<a href="mercuryregister.php?osCsid=dd7dc0c55b81fa7f4374ad41cbdacea7">REGISTER</a>
    
    
    List<WebElement> Links =driver.findElements(By.tagName("a"));
    int Links_Cnt=Links.size();
    System.out.println("The total number of links on the New Tours Home Page are "+Links_Cnt);
    
    for(int i=0;i<Links_Cnt;i++)
    {
    String LinkName=Links.get(i).getText();
    System.out.println("The name of the link is :"+LinkName);
    }
    driver.quit();
    
	}

}
