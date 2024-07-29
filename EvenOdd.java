//Write a java program to check whether number is even or odd .

import java.util.*;
public class EvenOdd {
	
	public static void main (String [] args){
	
	Scanner ABC = new Scanner(System.in);	
	System.out.println("Enter the number ");
	int no = ABC.nextInt();
	
	if (no % 2 == 0 ){
	System.out.println("Given number is even number ");
	}
	else {
	System.out.println("Geven number is odd number ");
	}
	}
}	