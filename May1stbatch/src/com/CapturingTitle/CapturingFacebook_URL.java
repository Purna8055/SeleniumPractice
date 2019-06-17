package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingFacebook_URL {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	System.out.println("The title of facebook home page is:"+driver.getTitle());
    if(driver.getTitle().contains("Facebook"))
    {
    	System.out.println("Title matched-PASS");
    }
    else
    {
    	System.out.println("Title not matched-FAIL");
    }
     String Expected_url="facebook.com";
     System.out.println("The expected URL of Facebook home page is:"+Expected_url);
     String Actual_url=driver.getCurrentUrl();
     System.out.println("The actual URL of Facebook home page is:"+Actual_url);
     if(Actual_url.contains(Expected_url))
     {
    	 System.out.println("Successfully navigated to the Facebook Home-PASS ");
     }
     else
     {
    	 System.out.println("Failed to launch Facebook Home-FAIL");
     }
     driver.quit();
    }

}
