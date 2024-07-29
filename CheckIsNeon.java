// Write a java program to check whether number is neon or not.

import java.util.Scanner;

public class CheckIsNeon {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();

        int square = number * number;
        
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        String result = (sum == number) ? (number + " is a Neon number.") : (number + " is not a Neon number.");
        System.out.println(result);

        scanner.close();
    }
}