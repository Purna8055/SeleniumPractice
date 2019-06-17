package com.ScreenShots;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePage_ScreenShots {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="http://www.bing.com";
		driver.get(url);
		
		//Type Casting
		//Usually we put this block inside catch block.
		File BingHome=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(BingHome, new File("./ScreenShots/bing.png"));
        
		//TakesScreenshot is an interface of selenium WebDriver.
		//OutputType is an interface of selenium WebDriver.
		//FileUtils is a class selenium WebDriver.
		
		driver.quit();
	}

}

