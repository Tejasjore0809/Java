// Write a java program to find maximum between two numbers.

	
import java.util.*;
public class FindGreater {
	
	public static void main (String [] args ) {
	
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the First Number" );
	int FirstNumber = ABC.nextInt();
	System.out.println("Enter the Second Number");
	int SecondNumber = ABC.nextInt();
	

	if ( FirstNumber > SecondNumber ) {
	
	System.out.println("First number is greater");
	}
	else {
	System.out.println("Second number is greater");
	}
	
	}
}