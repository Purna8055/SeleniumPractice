package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class OHRM_LogIn 
{
WebDriver driver=null;

@BeforeTest

public void driverSetUp()
{
System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
driver= new FirefoxDriver();
String url="https://opensource-demo.orangehrmlive.com";
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void logIn()
{driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
}
@AfterTest
public void browserClose()
{driver.close();
System.out.println("Browser Closed");}



}
