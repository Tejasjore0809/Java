/* Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are YY number of guards, predict if he can safely manipulate all of them. */ 

import java.util.*;
public class ManipulateGuardApp {
	
	public static void main(String [] args ){
	
	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the number of test cases ");
	int testcases = ABC.nextInt();
	
	for (int i = 0; i < testcases; i++) {
	System.out.println("Enter the number of Apples");
            int X = ABC.nextInt();  
	System.out.println("Enter the number of Guardes");
            int Y = ABC.nextInt();           
   
            if (X >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
	}
}