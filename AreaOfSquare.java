// Write a java program to enter side of square and find its area.

public class AreaOfSquare {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        
         int area = a * a;
        
         System.out.printf("The area of the square is %d\n", area);
    }
}
