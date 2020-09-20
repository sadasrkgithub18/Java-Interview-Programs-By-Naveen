package com.naveen.part3;

public class ArmStrongNumber
{

	public static void main(String[] args) 
	{
	 int num = 371;
	 int actNum = num;
	 double result = 0;
	 
	 while(actNum !=0)
	 {
		 int n = actNum % 10;
		 result = result + Math.pow(n, 3);
		 actNum = actNum / 10;
	 }
	 
	 if(result == num)
	 {
		System.out.println(num +" is a armstrong number"); 
	 }
	 else
	 {
		 System.out.println(num +" is not a armstrong number"); 
	 }
	 
	}

}
