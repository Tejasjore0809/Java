/* Write a java  program to accept two integers and check whether they are equal or not.
Test Data : 15 15
Expected Output :
Number1 and Number2 are equal */

import java.util.*;	
public class CheckEqual {
	
	public static void main(String [] args) {
	
	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the two numbers ");
	int firstNumber = ABC.nextInt();
	int secondNumber = ABC.nextInt();		
	
	if(firstNumber == secondNumber ){
	System.out.println("First And Second  Number is Equal ");
	}else {
	System.out.println("First And Second  Number is Not Equal ");
	}
	}	
}