package com.AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailability_Click {

	public static void main(String[] args) 
	{ System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/");
		
		//Browser Maximize 
		driver.manage().window().maximize();
		
		//Click on check availability button
		driver.findElementById("searchBtn").click();
		
		//Alert is an interface in selenium webdriver,used to handle alerts.
		 Alert alt=driver.switchTo().alert();
		 String AlertMessage =alt.getText();
		 System.out.println("The alert message is: "+AlertMessage);
		 
		 alt.accept(); //this performs click/accept on Ok button. 
		//alt.dismiss(); This performs operation on cancel button.
		//alt.sendKeys(""); This sends text into an alert window.
		 
		 driver.quit();

	}

}
