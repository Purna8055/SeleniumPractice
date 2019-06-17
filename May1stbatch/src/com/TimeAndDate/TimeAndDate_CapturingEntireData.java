package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeAndDate_CapturingEntireData {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		String url="https://www.timeanddate.com/";
		driver.get(url);
        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//a[@href='/worldclock/']").click();
		//Last row xpath.
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		//first row xpath.
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
        String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
        String part2="]/td[";
        String part3="]";
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String data=driver.findElementByXPath(part1+i+part2+j+part3).getText();
				System.out.print(data);
			}
		System.out.println(" ");
		}
	 driver.close();
	}

}
