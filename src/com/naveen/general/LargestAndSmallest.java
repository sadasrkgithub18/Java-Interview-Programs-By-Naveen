package com.naveen.general;

import java.util.Arrays;

public class LargestAndSmallest 
{

	public static void main(String[] args) 
	{
	  int numbers[] = {-10, 78954 ,40, -88 , 78954, 0};
	  
	  int largest = numbers[0];
	  int smallest = numbers[0];
	  
	  for(int i = 1; i<numbers.length ; i++)
	  {
		  if(numbers[i]>largest)
		  {
			  largest = numbers[i];
		  }
		  else if(numbers[i]<smallest)
		  {
			  smallest = numbers[i];
		  }
	  }
	  
	  System.out.println("Given Array: "+Arrays.toString(numbers));
	  
	  System.out.println("Largest number is: "+largest);
	  System.out.println("Smallest number is: "+smallest);
	}

}
