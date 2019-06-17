package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElementByLinkText("Images").click();
		driver.findElement(By.name("q")).sendKeys("Samantha");
		driver.quit();
		

	}

}
