package com.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectOptinalValueFromDropdownList {

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	String url="http://newtours.demoaut.com";
	driver.get(url);
	
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	//<select name="country" size="1">
	WebElement Country=driver.findElement(By.name("country"));
    Select selection= new Select(Country);
    selection.selectByVisibleText("INDIA");
    //selection.selectByIndex(2);
    //selection.selectByValue("8");
     driver.quit();
   
	
	
		

	}

}
