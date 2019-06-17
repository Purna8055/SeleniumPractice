
package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserAutomation  {

	public static void main(String[] args) 
	{
		//ChromeBrowser Automation
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver CB=new ChromeDriver();
		CB.close();
       //FirefoxBrowser Automation
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Pranithkumar/Desktop/Selenium Projects/May1stbatch/DriverFiles/geckodriver.exe");
        FirefoxDriver FB=new FirefoxDriver();
        FB.close();
		
		//InternetExplore Automation
		
		System.setProperty("webdriver.ie.driver", "./DriverFiles/IEDriverServer.exe");
		InternetExplorerDriver IE=new InternetExplorerDriver();
		 IE.close();
	}

}
