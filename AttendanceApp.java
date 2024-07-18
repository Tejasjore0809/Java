//Accept the following from the user and calculate the percentage of class attended: 

import java.util.*;
public class AttendanceApp{
	
	public static void main(String [] args){
	
	Scanner ABC = new Scanner(System.in);
	int totalDays;
	int absentDays;
	System.out.printf("Enter the Total days of the Acadamic:");
	totalDays = ABC.nextInt();
	absentDays = ABC.nextInt();
	int presentDays = totalDays-absentDays;
	String eligibility = ( presentDays < 