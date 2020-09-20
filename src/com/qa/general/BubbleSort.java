package com.qa.general;

public class BubbleSort 
{
    public static void bubbleSort(int[] array)
    {
    	int temp = 0;
    	int n = array.length;
    	for(int i=0;i<n-1; i++)
    	{
    		for(int j=0; j<n-i-1; j++)
    		{
    			if(array[j] > array[j+1])
    			{
    				temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    }
	
	public static void main(String[] args) 
	{
	 int arr[] = {58,95,78,25,48,36,96,46,77};
	 
	 System.out.println("Before Sorting array is: ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 
	 System.out.println();
	 System.out.println("=============================");
	 
	 bubbleSort(arr);
	 
	 System.out.println("After Sorting Array is: ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 
	}
	

}
