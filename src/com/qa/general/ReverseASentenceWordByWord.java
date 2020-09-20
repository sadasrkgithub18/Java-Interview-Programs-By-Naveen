package com.qa.general;

public class ReverseASentenceWordByWord 
{
     public static void main(String[] args) 
     {
	   String str  = "The Sky is Blue";
	   String st[] = str.split(" ");
	   String rev  = "";
	   
	   for(int i=st.length-1;i>=0;i--)
	   {
		  rev = rev + st[i] + " ";   
	   }
	   System.out.println(str);
	   System.out.println(rev);
     }
}
