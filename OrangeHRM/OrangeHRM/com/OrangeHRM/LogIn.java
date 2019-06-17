package com.OrangeHRM;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn
	{Logger logger=Logger.getLogger(LogIn.class);
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com";

	@BeforeTest
	public void setUp()
	{
	PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver=new ChromeDriver();
	logger.info(" Browser Launched Successfully");
	driver.get(url);
	logger.info("Successfully launched OrangeHRM Applicaton");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test
	public void login()
	{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	logger.info("Username entered successfully");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	logger.info("Password entered successfully");
	driver.findElement(By.id("btnLogin")).click();
	logger.info("Successfully performed click operation on login button");

	String Expected_Text="Welcome Admin";
	logger.info("The expected login text is: "+Expected_Text);

	String Actual_Text=driver.findElement(By.id("welcome")).getText();
	logger.info("The actual login text is: "+Actual_Text);

	if(Actual_Text.contains(Expected_Text))
	{
	logger.info("Login successfully done: PASS");
	}
	else
	{
	logger.info("Log in failed: FAIL");	
	}
	
	}

	@AfterTest
	public void tearDown()
	{
	driver.quit();
	logger.info("Successfully Closed OrangeHRM app");
	}


}



