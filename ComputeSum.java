// Q4. Write a Java program and compute the sum of an integer's digits.
//			Input : 123      Output : 6
			
import java.util.*;
public class ComputeSum{
	
	public static void main(String [] args){

	Scanner ABC = new Scanner(System.in);
	int a;
	int sum=0;
	System.out.printf("Enter the number:");
	a = ABC.nextInt();
	int lastdigit =0;

	lastdigit = a % 10;
	sum += lastdigit;
	a = a/10;

	lastdigit = a % 10;
	sum += lastdigit;
	a = a/10;

	lastdigit = a % 10;
	sum += lastdigit;
	a = a/10;


	
	System.out.printf("The sum of digits is:%d \n",sum);
	
	}	
}
		