package com.naveen.part1;

public class SwapTwoNumWithTemp 
{

	public static void main(String[] args) 
	{
	  int a = 10;
	  int b = 20;
	  
	  System.out.println("Before Swapping:");
	  System.out.println("a = "+a);
	  System.out.println("b = "+b);
	  
	  System.out.println("After Swapping;");
	  
	  int c;
	  c = a;
	  a = b;
	  b = c;  
	  System.out.println("a = "+a);
	  System.out.println("b = "+b);
	  
	}

}
