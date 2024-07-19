// Write a java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class CheckPorfitLoss {
	public static void main(String [] args)
	{
	int Cp,Sp;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the cost price:");
	Cp = ABC.nextInt();
	System.out.println("Enter the selling price:");
	Sp = ABC.nextInt();	
	String result = (Cp > Sp ) ? "The product is in Loss" : "The product is in Profit" ;
	System.out.println(result);
	}
}