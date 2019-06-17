package com.OrangeHRM_LogIn;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 
{WebDriver driver = null;
String url="https://opensource-demo.orangehrmlive.com";

	@Given("^Open firefox browser and navigate to OrangeHRM application$")
	public void Open_firefox_browser_and_navigate_to_OrangeHRM_application()
	{
	System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

	@When("^User enters valid user name, password and click on signin button$")
	public void User_enters_valid_user_name_password_and_click_on_signin_button()
	{
	//id="txtUsername"
	driver.findElement(By.id("txtUsername")).sendKeys("Aadmin");
	//id="txtPassword"
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//id="btnLogin"
	driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^User should be able to successfully login to OrangeHRM application and close$")
	public void User_should_be_able_to_successfully_login_to_OrangeHRM_application_and_close() throws IOException 
	{
		try{
			String Expected_Text="Welcome Admin";
			System.out.println("The expected text is: "+Expected_Text);
			
			String Actual_Text = driver.findElement(By.id("welcome")).getText();
			System.out.println("The actual text is: "+Actual_Text);
			
			if(Actual_Text.contains(Expected_Text))
			{
				System.out.println("Log In is successful: PASS");
			}
		}
		catch(Exception e)
		{    //id="spanMessage"
			String SpanMessage=driver.findElement(By.id("spanMessage")).getText();
			if(SpanMessage.contains("Invalid credentials"))
			{
		    File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot,new File("./Screenshots/imp.png"));
		    System.out.println("Log In Failed");
		    
			}
		}
	   driver.quit(); 
	}
}
