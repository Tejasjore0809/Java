// Write a Java program to enter temperature in Fahrenheit and convert to Celsius.

public class TempratureConvert {

	public static void main(String [] args){

double fah = Double.parseDouble(args[0]);
double cel = (fah - 32) * 5/9;

System.out.printf("The temperature into celsius is: %f\n",cel);
	}
}
