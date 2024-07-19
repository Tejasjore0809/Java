// Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;
public class CheckCase{
	
	public static void main (String [] args) 
	{
	char a;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the chacter:");
	a = ABC.next().charAt(0);
	String result = (a >= 'a' && a <= 'z') ? "The given character is in Lowercase" : "The given character is in Uppercase";
	System.out.println(result);
	}
}