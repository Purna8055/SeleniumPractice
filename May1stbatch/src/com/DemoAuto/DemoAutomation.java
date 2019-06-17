package com.DemoAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
//<input type="text" name="userName" size="10">
	driver.findElement(By.name("userName")).sendKeys("Pranith");
//<input type="password" name="password" size="10">
	driver.findElementByName("password").sendKeys("purna1_31");
//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1852c3b73a7aba40a0c71c00039b1572" width="58" height="17" alt="Sign-In" border="0">
	driver.findElementByName("login").click();
	
	}

}

