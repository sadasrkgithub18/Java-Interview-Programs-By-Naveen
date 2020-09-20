package com.naveen.part2;

public class ReverseANumber2 
{

	public static void main(String[] args) 
	{
		int num = 58749;
		String s = String.valueOf(num);
		
		String rev ="";
		
		System.out.println(s.length());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse of string number is: "+rev);
		
		int revNum = Integer.parseInt(rev);
		
		System.out.println("Reverse of number is: "+revNum);
	}

}
