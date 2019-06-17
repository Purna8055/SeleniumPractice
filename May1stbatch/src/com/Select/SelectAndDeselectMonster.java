package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectMonster {

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	String url="https://my.monsterindia.com/sponsered_popup.html";
	driver.get(url);
	
	
	WebElement CurrentLocation=driver.findElementByName("currentloc");
	Select selection=new Select(CurrentLocation);
	selection.selectByVisibleText("Delhi");
	
	List<WebElement>CurrentLocations=CurrentLocation.findElements(By.tagName("option"));
	System.out.println("The number of locations present are: "+CurrentLocations.size());
	
	for(int i=0;i<CurrentLocations.size();i++)
	{
		String CurrentLocationName=CurrentLocations.get(i).getText();
		System.out.println("The current location chosen is: "+CurrentLocationName);
		
	}
	
	//<select name="industry" size="4" id="id_industry" >
	WebElement Industry=driver.findElement(By.id("id_industry"));
	Select Industries = new Select(Industry);
	Industries.selectByVisibleText("Automotive/ Ancillaries");
	Industries.selectByIndex(3);
	Industries.selectByValue("8");
	Industries.deselectAll();
	
	List<WebElement>IndustryNames=Industry.findElements(By.tagName("option"));
	for(int i=0;i<IndustryNames.size();i++)
	{
		String IndustryName=IndustryNames.get(i).getText();
		System.out.println(IndustryName);
	}
	
	driver.quit();
	
	}

}
