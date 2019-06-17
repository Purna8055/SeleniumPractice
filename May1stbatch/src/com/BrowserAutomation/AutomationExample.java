package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver FB=new FirefoxDriver();
		FB.get("http://bing.com");
		FB.navigate().to("http://facebook.com");
		

	}

}
