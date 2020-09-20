package com.naveen.part1;

public class LargestAmongThreeNumbers 
{

	public static void main(String[] args) 
	{
	 int x = 700;
	 int y = 900;
	 int z = 900;
	 
	 if(x>y && x>z)
	 {
	    System.out.println("X is greatest");	 
	 }
	 else if(y>z)
	 {
		 System.out.println("Y is greatest");
	 }
	 else
	 {
		 System.out.println("Z is greatest");	 
	 }
	 
	 System.out.println("=================================");
	 
	 if(x>=y)
	 {
		 if(x>=z)
		 {
			 System.out.println("X is greatest");
		 }
		 else
		 {
			 System.out.println("Z is greatest");
		 }
	 }
	 else
	 {
		 if(y>=z)
		 {
			 System.out.println("Y is greatest"); 
		 }
		 else
		 {
			 System.out.println("Z is greatest");
		 }
	 }
	 
	}

}
