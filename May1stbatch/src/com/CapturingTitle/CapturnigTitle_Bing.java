package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturnigTitle_Bing 
{

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	WebDriver driver=null;
	driver=new FirefoxDriver();
	String URL="http://www.bing.com";
	driver.get(URL);
	String bing_Title =driver.getTitle();
	System.out.println("The title of Bing Home is:"+bing_Title);
	driver.quit();

	}

}
