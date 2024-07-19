// Write a program to determine eligibility for admission to a professional course based on the following criteria.

import java.util.*;
public class CheckEligibilityApp{

	public static void main(String [] args){
	
	Scanner ABC = new Scanner(System.in);
	int math,phy,chem;
	System.out.println("Enter the Maths Marks:");
	math = ABC.nextInt();
	System.out.println("Enter the Physics Marks:");
	phy = ABC.nextInt();
	System.out.println("Enter the chemistry Marks:");
	chem = ABC.nextInt();
	
	String eligibility = (math >= 65 && phy >= 65 && chem >= 50) ? "Eligible" : ( math+phy+chem >= 190 || math+phy >= 140 ) ? "You are Eligible" : "You are not Eligible";

	System.out.printf("The result is " + eligibility);
	}	
}