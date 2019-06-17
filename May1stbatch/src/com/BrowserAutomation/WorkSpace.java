package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		String URL="http://www.bing.com";
		driver.get(URL);
		String bing_Title =driver.getTitle();
		System.out.println("The title of Bing Home is:"+bing_Title);
		driver.quit();

	}

}
