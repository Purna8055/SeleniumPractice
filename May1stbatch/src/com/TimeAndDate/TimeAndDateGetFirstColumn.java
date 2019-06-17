package com.TimeAndDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndDateGetFirstColumn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="https://www.timeanddate.com/worldclock/";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		for(int i=1;i<=36;i++)
		{
			String Place=driver.findElementByXPath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a").getText();
			System.out.println(Place);
		
		} driver.quit();
	}

}
