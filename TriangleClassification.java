/* Write a java program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle 
using if else. How to check whether a triangle is equilateral, scalene or isosceles triangle in java programming. Logic to 
classify triangles as equilateral, scalene or isosceles triangle if sides are given in java program.  */ 

import java.util.*;
public class TriangleClassification {

	public static void main (String [] args ){

	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the first side");
	int x = ABC.nextInt();
	System.out.println("Enter the second side");
	int y = ABC.nextInt();
	System.out.println("Enter the third side");
	int z = ABC.nextInt();
	
	if (x == y && y ==z){
	System.out.println("The given triangle is equilateral triangle");
	}
	else if (x == y || y == z || z == x ){
	System.out.println("The given triangle is Isosceles triangle ");
	}else {
        System.out.println("Scalene Triangle");
	}
	}
}
