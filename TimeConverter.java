// Q2. Write a Java program to convert seconds to hours, minutes and seconds. 


import java.util.*;
public class TimeConverter{

	public static void main(String [] args )
	{
	Scanner xyz = new Scanner(System.in);
	int a;
	System.out.printf("Enter the Seconds:");
	a = xyz.nextInt();
	int hours = a/3600;
	System.out.printf("Given seconds in hours is: %d",hours);
	int minutes = a/60;
	System.out.printf("\nGiven seconds into minutes is:%d",minutes);
	}
}