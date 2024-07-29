//Write a program to calculate Electricity bill as per data.

import java.util.Scanner;

public class ElectricityBillApp {

    public static void main(String[] args) {
        Scanner ABC = new Scanner(System.in);
        int units;
        System.out.print("Enter the number of units: ");
        units = ABC.nextInt();

        float charges = (units <= 50) ? units * 0.50f : (units <= 100) ? 50 * 0.50f + (units - 50) * 0.75f : (units <= 250) ? 50 * 0.50f + 50 * 0.75f + (units - 100) * 1.20f : 50 * 0.50f + 	50 * 0.75f + 150 * 1.20f + (units - 250) * 1.50f;

        System.out.printf("The charges as per units is: %.2f\n", charges);

        float additionalCharge = charges * 0.20f;
        float totalAmount = charges + additionalCharge;

        System.out.printf("After applying the Additional charge to the bill, the total amount is: %.2f\n", totalAmount);
    }
}
