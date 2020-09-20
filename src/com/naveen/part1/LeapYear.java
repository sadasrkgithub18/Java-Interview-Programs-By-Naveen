package com.naveen.part1;

public class LeapYear 
{
	public static void main(String[] args) 
	{
	 int year = 2300;
	 boolean leap = false;
	 
	 if(year % 4 == 0)
	 {
	    if(year % 100 == 0)
	    {
	    	if(year % 400 == 0)
	    	{
	    		leap = true;
	    	}	
	    }
	    else
	    {
	    	leap = true;
	    }
	 }
	 else
	 {
		 leap = false;
	 }
	 
	 if(leap)
	 {
		 System.out.println(year+" is leap year");
	 }
	 else
	 {
		 System.out.println(year+" is not a leap year");
	 }
	 
	}
}
