// Q3. Write a Java program that reads a number and display the cube, and fourth power. 

import java.util.*;

public class ApplyMath{

	public static void main(String [] args){
	
	Scanner ABC = new Scanner(System.in);
	int a;
	System.out.printf("Enter the number:");
	a = ABC.nextInt();
	int cube = a * a * a;
	System.out.printf("The Cube of given number is:%d",cube);
	int fourthPower = a * a * a * a;
	System.out.printf("\n The fourth power of the given number is:%d",fourthPower);
	}
}