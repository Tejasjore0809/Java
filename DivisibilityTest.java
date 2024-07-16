// Write a java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
public class DivisibilityTest {
	
	public static void main(String [] args)
	{
	int number;
	Scanner ABC = new Scanner(System.in);
	System.out.printf("Enter the number ");
	number = ABC.nextInt();
	String result = (number % 5 == 0  && number % 11 == 0 ) ? "Divisible by 5 & 11." : "Not Divisible by 5 & 11.";
	System.out.printf("The number is " + result);
	}	
} 