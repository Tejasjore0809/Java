/* Write a java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95% */

import java.util.*;
public class CalculateSalary{

	public static void main(String [] args){
	
	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the Salary ");
	double  basicsalary = ABC.nextDouble();
	
	 double hra;
        double da;

        if (basicsalary <= 10000) {
            hra = 0.20 * basicsalary;
            da = 0.80 * basicsalary;
        }
	else if (basicsalary <= 20000) {
            hra = 0.25 * basicsalary;
            da = 0.90 * basicsalary;
        } 
	else {
            hra = 0.30 * basicsalary;
            da = 0.95 * basicsalary;
        }

        double grossSalary = basicsalary + hra + da;

	System.out.println("After calculating Gross Salary is " + grossSalary);
	}
}