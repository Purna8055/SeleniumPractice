package com.JavaProgram;

public class MethodExample1 {

	public void Test1()
	{
		System.out.println("Test1 executed sucessfully");

		
	}
	public static void main(String [] args){
		MethodExample1 m=new MethodExample1();
		m.Test1();
		m.Test2();
	}
	public void Test2()
	{System.out.println("Test2 executed sucessfully");}
}
