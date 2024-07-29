/* Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill */

import java.util.*;
public class ElectricityBill {
	
	public static void main (String [] args) {
	
	Scanner ABC = new Scanner(System.in) ;
	System.out.println("Enter the number of units");
	double units = ABC.nextDouble();
	
	double charges;

	if(units <= 50) {
	 charges = units * 0.50 ;
	}else if(units > 50 && units <= 150 ){
	 charges = units * 0.75 ;
	}else if (units >150 && units <=250 ){
	 charges = units * 1.20 ;
	} else 
	{
         charges = units * 1.50;
	}
	
	System.out.println("The total charges as per units is " + charges );
	
	double surcharges  = charges * 20 / 100 ;
	double totalBill = charges + surcharges ;
	
	System.out.println("The total Bill is " + totalBill );
	}
}
	