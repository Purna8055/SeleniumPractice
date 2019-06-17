package com.Attribute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationUsingAttribute {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url="http://newtours.demoaut.com";
		driver.get(url);
		
		WebElement Register=driver.findElementByLinkText("REGISTER");
		String ExpectedUrl=driver.findElementByLinkText("REGISTER").getAttribute("href");
		System.out.println("The Expected url is: "+ExpectedUrl);
		Register.click();
		//driver.findElementByLinkText("REGISTER").click();
		 String ActualUrl=driver.getCurrentUrl();
		 System.out.println("The current url is: "+ActualUrl);
		 
		 if(ActualUrl.equals(ExpectedUrl))
		 {
			 System.out.println("Successfully reached register page-PASS");
		 }
		 else{
			 System.out.println("Failed to navigate to the register page-FAIL");
			 
		 }
		 driver.quit();
	}

}
