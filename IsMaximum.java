// Write a java program to find maximum between two numbers.

import java.util.*;
public class IsMaximum {
		
	public static void main (String [] args)
	{
	int firstNumber , secondNumber;
	Scanner ABC = new Scanner(System.in);
	System.out.printf("Enter the first number :");
	firstNumber = ABC.nextInt();
	System.out.printf("Enter the second number :");
	secondNumber = ABC.nextInt();
	String Max = ( firstNumber > secondNumber ) ? "First number is greater " : "Second number is greater" ;
	System.out.printf(Max);
	}
}