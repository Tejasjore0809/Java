// Write a java program to enter radius of a circle and find its diameter, circumference.

public class AreaOfCircle {

	public static void main(String [] args){

int radius = Integer.parseInt(args[0]);
int diameter = 2 * radius;
double circumference = 2 * 3.14 * radius;

System.out.printf("The diameter of the circle is:%d\n", diameter);
System.out.printf("The circumference of the circle is:%f\n",circumference);
	}
}