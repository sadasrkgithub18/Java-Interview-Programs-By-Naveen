package com.qa.general;

public class ReverseEachWordOfString 
{

	public static void main(String[] args) 
	{
		reverseEachWordOfString("Java and Selenium");
		reverseEachWordOfString("The sky is blue");
		reverseEachWordOfString("Sun Rises in the east");
	}

	public static void reverseEachWordOfString(String inputString)
	{
		String[] words = inputString.split(" ");
		String revString = "";
		
		for(int i=0; i<words.length ;i++)
		{
			String word = words[i];
			
			String revword = "";
			
			for(int j = word.length()-1; j>=0; j--)
			{
				revword = revword + word.charAt(j);
			}
			
			revString = revString + revword + " ";
		}
		
		System.out.println(inputString);
		System.out.println(revString);
		System.out.println("=====================");
	}
	
	
}
