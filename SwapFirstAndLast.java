// Write a program to enter any digit number and swap first and last digit of a number.

import java.util.*;
public class SwapFirstAndLast{

	public static void main(String [] args){
	int a;
	Scanner ABC = new Scanner(System.in);
	System.out.printf("Enter the number:");
	a = ABC.nextInt();
	int reverse =0;
	int lastdigit = a % 10;
	int removeLastDigit = a/10;
	System.out.printf("The lastdigit of the number is:%d",lastdigit);
	System.out.printf("The number after remvoed the lastdigit is :%d",removeLastDigit);

	int firstDigit = a;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
	System.out.printf("The first number of the number is:%d",firstDigit);
	
	int middleNumbers = removeLastDigit;
        while (middleNumbers >= 1) {
        middleNumbers = middleNumbers % 10;
        }
	System.out.printf("The middleNumbers are:%d",middleNumbers);
	}
}

