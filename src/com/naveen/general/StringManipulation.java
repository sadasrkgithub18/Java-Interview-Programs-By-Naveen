package com.naveen.general;

public class StringManipulation 
{

	public static void main(String[] args) 
	{
	  String str = "Java Selenium and Testing";
	  String str1 = "Java SeleniuM and Testing";
	  
	  
	  System.out.println(str.length());
	  
	  System.out.println(str.charAt(5));
	  
	  System.out.println(str.indexOf('e')); //1st occurence
	  
	  System.out.println(str.indexOf('e', str.indexOf('e') + 1)); //2nd occurence
	  
	  System.out.println(str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1)); //3rd occurence
	  
	  
	  System.out.println(str.indexOf("Selenium"));
	  System.out.println(str.indexOf("Hello"));
	 
	  //String Comparison
	  System.out.println(str.equals(str1));
	  System.out.println(str.equalsIgnoreCase(str1));
	  
	  //sub string
	  System.out.println(str.substring(0,14));
	  
	  //trim
	  String s = "   Hello World  ";
	  System.out.println(s.trim());
	  
	  //replace
	  System.out.println(s.replace(" ", ""));
	  
	  String date = "18-06-1995";
	  System.out.println(date.replace("-", "/"));
	  
	  //split
	  String test = "Hello_World_Test_Selenium";
	  String val[] = test.split("_");
	  
	  for(int i=0; i<val.length;i++)
	  {
		  System.out.println(val[i]);
	  }
	}

}
