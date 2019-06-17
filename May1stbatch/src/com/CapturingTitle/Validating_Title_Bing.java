package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title_Bing {

	public static void main(String[] args) 
	{  System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	WebDriver driver=null;
		driver=new FirefoxDriver();
		String URL="http://bing.com";
		driver.get(URL);
		String Expected_Title="bing";
		System.out.println("The expected title of Bing Home Page is:"+Expected_Title);
		String Actual_Title=driver.getTitle();
		System.out.println("The actual title of Bing Home Page is:"+Actual_Title);
		if(Actual_Title.equalsIgnoreCase(Expected_Title))
		{
			System.out.println("The title matched-PASS");
		}
		else 
		{
			System.out.println("The title is not matching-FAIL");
		}
		driver.quit();

	}

}
