// Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class IsVowel{
	
	public static void main(String [] args)
	{
	char a;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the chacter");
	a = ABC.next().charAt(0); 
	String result = (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a =='u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a =='U') ? "The given chacter is vowel" : "The given chacter is consonant";
	System.out.println(result);
	}	
}