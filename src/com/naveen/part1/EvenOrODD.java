package com.naveen.part1;

import java.util.Scanner;

public class EvenOrODD
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	  Scanner reader = new Scanner(System.in);
	  System.out.println("Please enter a Number:");
	  
	  int num  = reader.nextInt();
	  
	  if(num % 2 == 0)
	  {
		  System.out.println(num +" is Even number");
	  }
	  else
	  {
		 System.out.println(num + " is Odd Number"); 
	  }
	}

}
