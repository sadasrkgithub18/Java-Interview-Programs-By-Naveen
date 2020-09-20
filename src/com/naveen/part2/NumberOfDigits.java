package com.naveen.part2;

public class NumberOfDigits 
{

	public static void main(String[] args) 
	{
	  //int num = 5050;
	  long num = 9848022338l;
	  
	  int count = 0;
	  
	  while(num != 0)
	  {
		 num = num/10;
		 count++;
	  }
	  System.out.println("No.of Digits in the number is: "+count);
	}

}
