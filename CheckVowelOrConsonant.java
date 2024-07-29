/*  Write a java program to check whether an alphabet is vowel or consonant using if else. How to check vowels and 
consonants using if else in java programming. java Program to input a character from user and check whether it is vowel or 
consonant. Logic to check vowel or consonant in java programming. */

import java.util.*;
public class CheckVowelOrConsonant {
	
	public static void main (String [] args ) {
	
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the chacter ");
	char a = ABC.next().charAt(0);
	char ch = Character.toLowerCase(a);
	if( ch == 'a' ||  ch == 'e' ||  ch == 'i' ||  ch == 'o' ||  ch == 'u' ){
	System.out.println("The given char is Vowel ");
	}else {
	System.out.println("The given char is consonant");
	}
	}
}