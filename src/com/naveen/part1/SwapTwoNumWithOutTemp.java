package com.naveen.part1;

public class SwapTwoNumWithOutTemp 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		  
		  System.out.println("Before Swapping:");
		  System.out.println("a = "+a);
		  System.out.println("b = "+b);
		  
		  System.out.println("After Swapping;");
		    
		  a = a-b;
		  b = a+b;
		  a = b-a;
		  System.out.println("a = "+a);
		  System.out.println("b = "+b);
	}

}
