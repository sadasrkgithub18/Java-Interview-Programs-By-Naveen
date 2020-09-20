package com.naveen.part4;

public class CheckPrime 
{

	public static void main(String[] args) 
	{
	  int num = 18;
	  
	  boolean flag = false;
	  
	  for(int i = 2; i<= num/2 ; i++)
	  {
		  if(checkPrime(i))
		  {
			  if(checkPrime(num-i))
			  {
				  System.out.println(num + " = " + i + " + " +(num-i));
				  flag = true;
			  }
		  }
	  }
	  
	  if(!flag)
	  {
		  System.out.println(num + " Cannot be expressed as sum of two prime numbers");
	  }
	  
	}
	
	public static boolean checkPrime(int num)
	{
		boolean isPrime = true;
		
		for(int i=2 ; i<=num/2 ;i++)
		{
			if(num % i  == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
