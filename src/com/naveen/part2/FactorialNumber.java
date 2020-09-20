package com.naveen.part2;

public class FactorialNumber 
{

	public static void main(String[] args) 
	{
	  int num = 0;
	  getFact(num);
	}

	public static void getFact(int n)
	{
		int fact = 1;
		
		for(int i = 1; i<=n ; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +n+" is: "+fact);
	}
}
