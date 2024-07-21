// Write a program to enter any digit number and reverse middle number rather than first and last digit.
import java.util.*;

public class ReverseMiddle{
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
	
	while(removeLastDigit >= 0){
	int remainder = a % 10;  
	reverse = reverse * 10 + remainder;  
	a = a/10;  
	}

	System.out.printf("The numbers after reverse the string is:%d",reverse);

	}
}