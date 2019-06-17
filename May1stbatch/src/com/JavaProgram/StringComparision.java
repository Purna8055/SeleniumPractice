package com.JavaProgram;

public class StringComparision {

	public static void main(String[] args) 
	{
		String a="Hello";
		String b="Hello";
		if(a.equals(b))
		{System.out.println("Both the strings are equal");}
		else
		{System.out.println("Both the strings are not equal");}
        System.out.println("*************************");
	    String x="Hello";
	    String y="hello";
	    if(x.equals(y))
	    {System.out.println("Both the strings are equal");}
	    else
	    {System.out.println("Both the strings are not equal");}
System.out.println("**********************************");
	String p="Hello";
	String q="hello";
	if(p.equalsIgnoreCase(q))
	{System.out.println("Both the strings are equal");}
	else
	{System.out.println("Both the strings are not equal");}
System.out.println("***********************************");
    String k="Hello";
    String l=" hello";
    if(k.equalsIgnoreCase(l))
    {System.out.println("Both the strings are equal");}
    else
    	{System.out.println("Both the strings are not equal");}
System.out.println("**********************************");	
	String i="Hello";
	String j="ello";
	if(j.contains(i))
	{System.out.println("string existing");}
	else
	{System.out.println("string not found");}
System.out.println("**********************************");	
	 String h="I LOVE YOU";
	 int stringlength=h.length();
	 {System.out.println("String length:"+stringlength);}
System.out.println("**************************************");	 

	 String w="Chello";
	 String v="Hello";
	 if (w.length()==v.length())
	 {System.out.println("The length of both the strings are equal");}
	else
	{System.out.println("The length of both the strings are not equal");}
	
	
	}
	
}
