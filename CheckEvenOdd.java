// Write a java program to check whether number is even or odd 

import java.util.*;
public class CheckEvenOdd{
	
	public static void main(String [] args)
	{
	int a;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the number:");
	a = ABC.nextInt();
	String iseven = (a %2 == 0) ? "Even" : "odd" ;
	System.out.println("The given number is " +iseven);
	}	
}