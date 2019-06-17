package com.JavaProgram;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{ String a[][]=new String[2][2];
	a[0][0]="Manual Testing";
	a[0][1]="Vishnu";
	a[1][0]="Selenium";
	a[1][1]="Srinivas";
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{System.out.print(a[i][j]+" ");}
		System.out.println(" ");
	}
	

	}

}
