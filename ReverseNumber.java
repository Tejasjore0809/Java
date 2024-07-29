// Write a program to reverse any digits number.

import java.util.*;
public class ReverseNumber{

	public static void main (String [] args){

	Scanner ABC = new Scanner(System.in);
	int a;
	System.out.println("Enter the number: ");
	a = ABC.nextInt();
	int reverse = 0;
	
	while(a != 0){
	int remainder = a % 10;  
	reverse = reverse * 10 + remainder;  
	a = a/10; 
	}
	
System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  
	
	