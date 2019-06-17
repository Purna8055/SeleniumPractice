package com.AutomationTestScript_newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterModule {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");
        driver.findElement(By.name("login")).click();
        String Expected_Title= "Find";
        String Actual_Title=driver.getTitle();
        if(Actual_Title.contains(Expected_Title))
        {
        	System.out.println("The log in is successfully done-PASS");
        }
        else
        {
        	System.out.println("The log in is failed-FAIL");
        }
        
        driver.findElementByName("findFlights").click();
        String Expected_Tit="Select a Flight";
        String Actual_Tit=driver.getTitle();
        if(Actual_Tit.contains(Expected_Tit))
        {System.out.println("The flight selection page is opened successfully-PASS");}
        else
        	{System.out.println("It failed to open the flight selection page-FAIL");}
       // System.out.println("The title of the page is:"+driver.getTitle());
       driver.findElementByName("reserveFlights").click();
       String Expected_T="Book";
       String Actual_T=driver.getTitle();
       if(Actual_T.contains(Expected_T))
       {System.out.println("Book a flight page opened successfully -PASS");}
       else
       {System.out.println("It failed to open the Book a flight page-FAIL");}
      
       driver.findElementByName("passFirst0").sendKeys("Pranith");
       driver.findElementByName("passLast0").sendKeys("Behera");
       driver.findElementByName("creditnumber").sendKeys("3031329216643152");
       driver.findElementByName("buyFlights").click();
       
       String Expected_Ti="Flight Confirmation";
       String Actual_Ti=driver.getTitle();
       
       if(Actual_Ti.contains(Expected_Ti))
       {System.out.println("The flight confirmation page opened successfully-PASS");}
       else
       {System.out.println("It failed to open the flight comfirmation page-FAIL");}
      // System.out.println("The title of the page is:"+driver.getTitle());
       driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
       String Expected_t="Sign-on";
       String Actual_t=driver.getTitle();
       if(Actual_t.contains(Expected_t))
       {System.out.println("After Log out Sign On page came successfully-PASS");}
       else
       {System.out.println("After Log out Sign-on page didn't come-FAIL");}
       driver.quit();

        
        
        
        
	}

}
