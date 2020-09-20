package com.naveen.general;

public class RemoveJunkAndSpecialCharsFromString 
{

	public static void main(String[] args) 
	{
	  String s = "@Java #Selenium &&QA *Testing ##SQL @DBA";
	  
	  s = s.replaceAll("[^a-zA-Z0-9]", " ");
	  System.out.println("String after removing the special chars: "+s);
	}

}
