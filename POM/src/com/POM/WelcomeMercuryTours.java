package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
	//Object repository class-Identification of an Element then performed operation
	@FindBy(name="userName")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="login")
	WebElement Sign_In;
	public void logIn(String userName,String password )
	{UserName.clear();
	UserName.sendKeys(userName);
	Password.clear();
	Password.sendKeys(password);
	Sign_In.click();
	}
	
	@FindBy(xpath="//a[@href='mercuryreservation.php']")
	WebElement Flights;
	public void flights()
	{
	Flights.click();
	}
	
	@FindBy(xpath="//a[@href='mercuryunderconst.php']")
	WebElement Hotels;
	public void hotels()
	{
	 Hotels.click();
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a")
	WebElement CarRentals;
	public void carRentals()
	{
	CarRentals.click();
	}
	
	@FindBy(xpath="//a[@href='mercurycruise.php']")
	WebElement Cruises;
	public void cruises()
	{
		Cruises.click();
	}
	
	@FindBy(xpath="//a[@href='mercuryunderconst.php']")
	WebElement Destinations;
	public void destinations()
	{
	Destinations.click();
	}
	
	@FindBy(xpath="//a[@href='mercuryunderconst.php']")
	WebElement Vacations;
	public void vacations()
	{
		Vacations.click();
	}
	
	@FindBy(xpath="//a[@href='mercurysignon.php']")
	WebElement SIGN_ON;
	public void signIn()
	{
		SIGN_ON.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	public void register()
	{
		Register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	public void support()
	{
		Support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	public void contact()
	{
	Contact.click();
	}
	
	@FindBy(linkText="SIGN-OFF")
	WebElement SignOut;
	public void signOff()
	{
		SignOut.click();
	}

	}

