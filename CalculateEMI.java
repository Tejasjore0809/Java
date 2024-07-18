//WAP to  input principal amount , interest and period of loan in months and calculate the emi of  users with interest rate?

import java.util.*;
public class CalculateEMI {
	
	public static void main(String [] args) {
	Scanner ABC = new Scanner(System.in);
	double amount , interestrate , period;
	System.out.println("Enter the amount of loan:");
	amount = ABC.nextInt();
	System.out.println("Enter the interest rate:");
	interestrate = ABC.nextInt();
	System.out.println("Enter the period of loan:");
	period = ABC.nextInt();

	 double monthlyInterestRate = interestrate / (12 * 100);

         double EMI = (amount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, period)) / 
                     (Math.pow(1 + monthlyInterestRate, period) - 1);

	System.out.println("The emi with interest rate is: " + EMI);
	}	
} 