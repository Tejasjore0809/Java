//Write a program to accept a co-ordiantes points in an x y co-ordinates system and determine which quadrant the co-ordinate point lies/

import java.util.*;
public class FindQuadrants {

	public static void main(String [] args){
	
	Scanner ABC = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number:");
        a = ABC.nextInt();
	System.out.print("Enter the second number:");
	b = ABC.nextInt();
	
	String quadrant = (a > 0 && b > 0) ? "First Quadrant" :
                          (a < 0 && b > 0) ? "Second Quadrant" :
                          (a < 0 && b < 0) ? "Third Quadrant" :
                          (a > 0 && b < 0) ? "Fourth Quadrant": "Enter the correct input";

	System.out.printf("The elements are lies in:"+ quadrant);
	}
}
	