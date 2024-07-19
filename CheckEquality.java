// Write a java program to accept two integers and check whether they are equal or not.
	
import java.util.*;
public class CheckEquality {
	
	public static void main (String [] args){
	int a,b;
	Scanner ABC = new Scanner(System.in);
	System.out.println("Enter the First number");
	a = ABC.nextInt();
	System.out.println("Enter the Second number");
	b = ABC.nextInt();
	String result = (a == b ) ? "The given numbers are equal" : "The given number is not equal";
	System.out.println(result);
	}	
}
	