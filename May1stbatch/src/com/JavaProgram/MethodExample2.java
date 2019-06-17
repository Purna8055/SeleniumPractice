package com.JavaProgram;

public class MethodExample2 {
 int a=10;
 int b=20;
 int c;
	public static void main(String[] args) 
	{
	MethodExample2 L=new MethodExample2();
	L.love();
	L.life();

	}
	public void love()
	{
		c=a+b;
		System.out.println("a+b="+c);
	}
	public void life()
	{
		c=a*b;
		System.out.println("a*b="+c);
	}

}
