package com.naveen.part3;

public class PowerConcept 
{

	public static void main(String[] args) 
	{
	  int base = 2;
	  int exponent = 10;
	  
	  int result = 1;
	  
	  while(exponent !=0)
	  {
		  result *= base;
		  exponent--;
	  }
	  
	  System.out.println(result);
	  
	  System.out.println("============================");
	  
	  System.out.println(Math.pow(base, exponent));
	}

}
