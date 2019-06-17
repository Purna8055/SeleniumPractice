package com.JavaProgram;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstRunnableProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");	
	    FirefoxDriver driver= new FirefoxDriver();
	    String url ="http://newtours.demoaut.com";
	    driver.get(url);
	    driver.quit();
	}

}
