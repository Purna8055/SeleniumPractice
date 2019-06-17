package com.DropDownListTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_DropDownListTesting 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");	
    FirefoxDriver driver= new FirefoxDriver();
    String url ="http://newtours.demoaut.com";
    driver.get(url);
    
    driver.findElement(By.linkText("REGISTER")).click();
    
    WebElement Country=driver.findElement(By.name("country"));
    List<WebElement>CountryList=Country.findElements(By.tagName("option"));
    
    System.out.println("The total number of countries are: "+CountryList.size());
     for(int i=0;i<CountryList.size();i++)
     {
    	 String CountryName=CountryList.get(i).getText();
    	 System.out.println(i+"."+CountryName);
    	 System.out.println("");
     
         CountryList.get(107).click();
     
     }
     driver.quit();
       
	}

}
