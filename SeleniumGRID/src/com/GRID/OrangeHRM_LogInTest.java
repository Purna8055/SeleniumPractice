package com.GRID;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM_LogInTest 
{
@Parameters("Browser")
@Test
public void logIn(String browser) throws IOException
{
//Connecting to NODES
 DesiredCapabilities cap = null;
 System.out.println("The Browser name is: "+browser);
 
 if(browser.equalsIgnoreCase("firefox"))
 {
	 cap = DesiredCapabilities.firefox();
	 cap.setBrowserName("firefox");
	 cap.setPlatform(Platform.WINDOWS);
 }
 else
   if(browser.equalsIgnoreCase("chrome"))
   
   {   cap = DesiredCapabilities.chrome();
	   cap.setBrowserName("chrome");
	   cap.setPlatform(Platform.WINDOWS);
   }
 System.out.println("Hello");
 RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.20.10.6:4444/wd/hub"),cap);
//Automation Test Script 
 String url = "https://opensource-demo.orangehrmlive.com";
driver.get(url);
driver.quit();
}

}
