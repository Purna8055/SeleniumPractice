package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Module_with_TryCatch {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	String url="http://opensource-demo.orangehrmlive.com";
	driver.get(url);
	

   try{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Aadmin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String Title=driver.getTitle();
		driver.findElement(By.linkText("Welcome Admin")).click();
        System.out.println(Title);}
   //OrangeHRM
   
   
	catch (Exception e) 
      
   {
		System.out.println("Invalid Credentials");
	 }	
	 
     System.out.println("Out of try-catch block...!!");
	}

}
