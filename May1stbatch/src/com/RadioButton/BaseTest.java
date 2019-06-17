package com.RadioButton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver=null;
String url="http://www.echoecho.com/htmlforms10.htm";
@BeforeTest
public void browserSetUp()
{
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
driver =new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
@AfterTest
public void browserShutDown()
{
driver.quit();
}
}
