package com.naveen.part2;

public class AlphabetCheck 
{

	public static void main(String[] args) 
	{
	  char c = 'M';
	  
	  if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		  System.out.println(c +" is an alphabet");
	  else
		  System.out.println(c +" is not an alphabet");
	  
	  System.out.println("=================================");
	  
	  if(Character.isAlphabetic(c))
		  System.out.println(c +" is an alphabet");
	  else
		  System.out.println(c +" is not an alphabet");
	  
	}

}
