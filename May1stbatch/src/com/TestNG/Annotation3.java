package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 
{
@BeforeMethod
public void gmailLaunchLogIn()
{System.out.println("Application Launch And LogIn");}

@Test(priority=0)
public void composeMail()
{
System.out.println("Compose Mail Functionality Testing");
}

@AfterMethod
public void gmailApplication_close()
{System.out.println("Gmail Application Close");}
}
