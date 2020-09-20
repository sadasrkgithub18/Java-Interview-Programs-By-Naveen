package com.qa.general;

import java.util.Arrays;

public class SecondLargestInArray 
{

	public static void main(String[] args) 
	{
		secondLargest(new int[] {20,6,47,69,53,59,57,19,66});
	}
	
	public static void secondLargest(int[] input)
	{
		int firstLargest, secondLargest;
		
		//If first element is greater than second element
		if(input[0] > input[1])
		{
			firstLargest   = input[0];
			secondLargest  = input[1];
		}
		
		//If second element is greater than first element
		else
		{
			firstLargest   = input[1];
			secondLargest  = input[0];	
		}
		
		//Checking remaining elements of input array
		for(int i=2; i<input.length ; i++)
		{
			//If element at 'i' is greater than 'firstLargest'
			if(input[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest   = input[i];
			}
			
			//If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
			else if(input[i] < firstLargest && input[i] > secondLargest)
			{
				secondLargest = input[i];
			}
		}
		
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(input));
		System.out.println("Second Largest Element is: ");
		System.out.println(secondLargest);
	}

}
