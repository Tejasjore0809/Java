// Q5.  Write a Java program to reverse a word.
		//Input a number: 123
		//Reverse number: 321

import java.util.*;
public class Reversestring{
	
	public static void main(String [] args){

	Scanner ABC = new Scanner(System.in);
	int a;
	System.out.printf("Enter the Input:");
	a = ABC.nextInt();
	int reverse =0;
	
	int remainder = a % 10;  
	reverse = reverse * 10 + remainder;  
	a = a/10;  

	remainder = a % 10;  
	reverse = reverse * 10 + remainder;  
	a = a/10; 

	remainder = a % 10;  
	reverse = reverse * 10 + remainder;  
	a = a/10; 
	 
System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  
		