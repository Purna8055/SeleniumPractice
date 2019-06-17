package com.KeyBoardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FBLogIn_UsingKeyboardOperation {

	public static void main(String[] args) 
	{System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	String url="http://facebook.com";
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
	driver.findElementByXPath("//input[@data-testid='royal_email']").sendKeys("srini");
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).sendKeys("Hello").perform();
	act.sendKeys(Keys.ENTER).perform();
	
	driver.quit();
		

	}

}
