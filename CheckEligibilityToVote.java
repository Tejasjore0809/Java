// Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class CheckEligibilityToVote {
		
	public static void main (String [] args){
	int age ;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the age :");
	age = ABC.nextInt();
	String result = (age >= 18) ? "Candidate is eligible to vote" : "Candiadate is not eligible to vote";
	System.out.println(result);
	}	
}