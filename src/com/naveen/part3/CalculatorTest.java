package com.naveen.part3;

import java.util.Scanner;

public class CalculatorTest 
{

	public static void main(String[] args) 
	{
	  @SuppressWarnings("resource")
	  Scanner reader = new Scanner(System.in);
	  
	  System.out.println("Enter 2 numbers");
	  
	  double first = reader.nextDouble();
	  double second = reader.nextDouble();
	  
	  System.out.println("Please select an operator: (+, - , * , /): ");
	  
	  char operator = reader.next().charAt(0);
	  
	  double result = 0;
	  
	  switch(operator)
	  {
	  case '+': result = first + second;
	            break;
	  case '-': result = first + second;
                break;
	  case '*': result = first + second;
                break;
	  case '/': result = first + second;
                break;
               
      default: System.out.println("Please enter a proper operator");          
               break;
	  }
	  
	  System.out.println(result);  
	}

}
