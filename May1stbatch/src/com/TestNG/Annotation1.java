package com.TestNG;

import org.testng.annotations.Test;

public class Annotation1 
{
	@Test(priority=0)
	public void applicationLaunch()
	{System.out.println("Gmail Applcation Launch");}
	
	@Test(priority=1)
	public void logIn()
	{System.out.println("Gmail Log In Functionality Testing");}
	
	@Test(priority=2)
	public void composeMail()
	{System.out.println("Compose Mail Functionality Testing");}
	
	@Test(priority=3)
	public void draft()
	{System.out.println("Draft Functionality Testing");}
	

}
