package com.NewToursAppBackToHomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursAppBackToHomeTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		String url="http:newtours.demoaut.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
		System.out.println("Successfully Navigated to Home Page");
		
		driver.quit();
		
		

	}

}
