// Q1. WAP to input three number and check which is greater using conditional operator?

import java.util.*;
public class IsGreater{

	public static void main (String [] args) 
	{
	Scanner ABC = new Scanner(System.in);
	int firstnumber ,secondnumber, thirdnumber ;
	System.out.println("Enter the numbers :");
	
	firstnumber = ABC.nextInt();
	secondnumber = ABC.nextInt();
	thirdnumber =  ABC.nextInt();
	
	int result = (firstnumber > secondnumber) ? (firstnumber > thirdnumber ? firstnumber : thirdnumber) : (secondnumber > thirdnumber ? secondnumber : thirdnumber);
	System.out.println("The greatest number is :" + result);
	}
}