/* Write a java program to check whether a triangle is valid or not if angles are given using if else. How to check whether a 
triangle can be formed or not, if its angles are given using if else in java programming. Logic to check triangle validity if 
angles are given in java program. */

import java.util.*;
public class CheckTriangleApp {

	public static void main (String [] args ) {	
	
	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the first angle ");
	int firstAngle = ABC.nextInt();
	
	System.out.println("Enter the second angle ");
	int secondAngle = ABC.nextInt();
	
	System.out.println("Enter the third angle ");
	int thirdAngle = ABC.nextInt();
	
	if (firstAngle + secondAngle + thirdAngle  == 180 ) {
	System.out.println("The given angles are Triangle ");
	}
	else {
	System.out.println("The given angles are not Triangle ");
	}
	}
}
