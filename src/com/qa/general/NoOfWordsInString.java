package com.qa.general;

public class NoOfWordsInString 
{
	public static void main(String[] args) 
	{
	  String s = "  Hello World and Java with Selenium  "; 
	  String a[] = s.trim().split(" ");
	  
	  System.out.println("No.of words in string are: "+a.length);
	}

}
