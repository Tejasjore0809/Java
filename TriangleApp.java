// Write a java program to check whether triangle is valid or not.

import java.util.*;
public class TriangleApp {

	public static void main(String [] args)
	{
	int a,b,c;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the number:");
	a = ABC.nextInt();
	b = ABC.nextInt();
	c = ABC.nextInt();
	String Checktriangle = (a + b > c || b + c > a || a + c > b ) ? " Triangle " : " Not Triangle ";
	System.out.println("By the given input is " +  Checktriangle);
	}	
}
