package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeAndDate_GetTheFirstCityName
{
public static void main(String[]args)
	{
	 System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.get("https://www.timeanddate.com/");
	 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//<a href="/worldclock/" class="navMenu__item">World Clock</a>
	driver.findElement(By.xpath("//a[@href='/worldclock/']")).click();
	//<a href="/worldclock/ghana/accra">Accra</a>
	String Name=driver.findElementByXPath("//a[@href='/worldclock/ghana/accra']").getText();
	//<td id="p0" class="rbi">Fri 09:09</td>
	String Time=driver.findElementById("p0").getText();
	System.out.println("Place Name is "+Name+" and the current Date&Time is "+Time);

driver.quit();
	}

}
