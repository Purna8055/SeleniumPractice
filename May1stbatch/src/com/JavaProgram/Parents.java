package com.JavaProgram;

public class Parents extends Simple
{
public void Test0()
{ 
System.out.println("I'm your father");	
}
public void Test()
{
System.out.println("You have to listen to me");
}
public static void main(String[]args)
{
	Parents P = new Parents();
	P.Test();
	P.Test0();
	P.Test4();
}
}
