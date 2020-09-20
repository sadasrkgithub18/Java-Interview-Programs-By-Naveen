package com.qa.general;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
	 int array[] = {10,20,89,57,69,47,55};
	 
	 int val = 99;
	 boolean flag = false;
	 for(int i = 0 ; i<array.length-1 ;i++)
	 {
		if(array[i] == val)
		{
			System.out.println("Element is present at Index: "+i);
			flag = true;
			break;
		}
	 }
	 
	  if(!flag)
	  {
		 System.out.println("Element is not available in the list"); 
	  }
	}

}
