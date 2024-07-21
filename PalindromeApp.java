// Write a java program to check whether number is palindrome or not.	

import java.util.Scanner;

public class PalindromeApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int originalNumber = scanner.nextInt();
        
        int number = originalNumber; 
        int reverse = 0;
        
        while (number != 0) {
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number / 10; 
        }
        
        String result = (originalNumber == reverse) ? "The given number is Palindrome" : "The given number is not Palindrome";    
        System.out.println(result);
    }    
}