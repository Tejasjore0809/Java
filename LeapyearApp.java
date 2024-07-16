// Write a java program to check whether a year is leap year or not.

import java.util.*;
public class LeapyearApp{
	
	public static void main (String [] args)
	{
	int year;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Input the year ");
	year = ABC.nextInt();	
	String result = (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? "Given year is a leap year" : "Given year is not a leap year" : "Given year is a leap year" : "Given year is not a leap year";
	System.out.println(result);
	}
}