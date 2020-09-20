package com.naveen.part3;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
	  int num = 1221;
	  int rev = 0;
	  int actNum = num;
	  
	  while(num !=0)
	  {
		  int n = num % 10;
		  rev = rev * 10 + n;
		  num = num / 10;
	  }
	  
	  System.out.println("Reverse of Number is: "+rev);
	  
	  System.out.println("============================");
	  
	  if(actNum == rev)
	  {
		  System.out.println(actNum+" is a palindrome number");
	  }
	  else
	  {
		  System.out.println(actNum+" is not a palindrome number");
	  }
	}

}
