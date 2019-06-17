package com.KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

WebDriver driver= null;
String url="http://www.newtours.demoaut.com";
@BeforeTest
public void browserSetUp()
{
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
driver= new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
@AfterTest
public void browserShutDown()
{
driver.quit();
}
}
