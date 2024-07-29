// Write a program to accept the cost price of a bike and display the road tax to be paid according to the following criteria.

import java.util.*;
public class TaxApp{

	
	public static void main(String [] args){
	int price;
	System.out.println("Enter the price of Bike:");
	Scanner ABC = new Scanner(System.in);
	price = ABC.nextInt();
		
	int totalTax =(price > 100000) ? price * 15 / 100 : (price > 50000 && price <= 100000) ? price * 10 / 100 : (price <= 50000) ? price * 5 / 100 : 0;	
	System.out.printf("The tax on the bike is: %d\n", totalTax);
	int totalCost = price + totalTax ;
	System.out.printf("The total cost of the bike is: %d\n",totalCost);
	}
}