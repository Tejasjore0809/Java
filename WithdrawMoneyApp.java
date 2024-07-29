/* Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction. */

import java.util.*;
public class WithdrawMoneyApp {
	
	public static void main (String [] args)
	{
	Scanner ABC = new Scanner(System.in);
	System.out.println("Total Account Balance is ");
	double totbalance = ABC.nextDouble();
	System.out.println("Enter the amount to withdraw");
	int withdraw = ABC.nextInt();

	if(withdraw % 5 == 0 && withdraw + 0.50 <= totbalance && totbalance<2000) {
		
	totbalance = totbalance - withdraw - 0.50 ;
	System.out.println("Money withdraw Successfully ! " + totbalance +" "  + "is your remaining amount");
	}
	else if (withdraw > totbalance ) {
	System.out.println("Insufficient Balance " + totbalance );
	}
	else {
	System.out.println("Enter the valid amount ");
	}
	
	}
}
	