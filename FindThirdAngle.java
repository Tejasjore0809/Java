/* Write a java Program to input two angles from user and find third angle of the triangle. How to find all angles of a triangle 
if two angles are given by user using java programming. java program to calculate the third angle of a triangle if two angles 
are given. */ 

import java.util.*;
public class FindThirdAngle {

	public static void main(String [] args){

	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the first angle ");
	int angle1 = ABC.nextInt();
	System.out.println("Enter the second angle ");
	int angle2 = ABC.nextInt();
	
	int angle3 = 180 - (angle1 + angle2);
	
	System.out.println("The third angle of triangle is " + angle3);
	}
}