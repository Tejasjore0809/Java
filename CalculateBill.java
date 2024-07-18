// Q3. WAP to input the meter unit and per unit rate and calculate total bill and if bill is more than 2000 then give discount on 20% otherwise 5% discount

import java.util.*;
public class CalculateBill {
	
	public static void main(String [] args)
	{
	Scanner ABC = new Scanner(System.in);
	double unit , rateperunit, totalbill ;
	System.out.println("Enter the total units :");
	unit = ABC.nextDouble();
	System.out.println("Enter the rate per unit : ");
	rateperunit = ABC.nextDouble();
	
	totalbill = unit * rateperunit ;
	
	System.out.println("Total bill is : " + totalbill);
	
	double finalbill = (totalbill > 2000) ? totalbill - (totalbill * 20 / 100) : totalbill - (totalbill * 5 / 100);
	
	System.out.println("The final bill after calculating discount is :" + finalbill);
	}
}