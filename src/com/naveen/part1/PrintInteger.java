package com.naveen.part1;

import java.util.Scanner;

public class PrintInteger 
{

	public static void main(String[] args) 
	{
	  @SuppressWarnings("resource")
	  Scanner reader = new Scanner(System.in);
	  System.out.println("Enter a Number");
	  int num =  reader.nextInt();
	  System.out.println("You Entered the number: "+num);
	}

}
