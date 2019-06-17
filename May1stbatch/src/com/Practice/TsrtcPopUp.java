package com.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcPopUp {

	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/");
		
		//Browser Maximize 
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Bus on Contract").click();
		Thread.sleep(10000);
		
		Alert Popup=driver.switchTo().alert();
		Popup.dismiss();

	}

}
