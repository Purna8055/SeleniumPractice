package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 
{
	@BeforeTest
	public void applicationLaunchAndLogIn()
	{System.out.println("Application Launch And LogIn");}
   
	@Test(enabled=false)
	public void composeMail()
	{System.out.println("Compose Mail Functionality Testing");}
	
	@Test(priority=0)
	public void draft()
	{System.out.println("Draft Functionality Testing");}
	
	@AfterTest
	public void gmailLogOut()
	{System.out.println("Gmail Log Out Functionalty Testing");}
	
	

}
