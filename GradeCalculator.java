// Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
// Percentage >= 90% : Grade A   Percentage >= 80% : Grade B  Percentage >= 70% : Grade C   Percentage >= 60% : Grade D   Percentage >= 40% : Grade E  Percentage < 40% : Grade F



import java.util.*;
public class GradeCalculator {

	public static void main (String [] args){
	
	Scanner ABC = new Scanner(System.in);
	
	System.out.println("Enter the marks of physics");
	int phy = ABC.nextInt();

	System.out.println("Enter the marks of Chemistry");
	int chem = ABC.nextInt();

	System.out.println("Enter the marks of Biology");
	int bio = ABC.nextInt();

	System.out.println("Enter the marks of Mathematics");
	int math = ABC.nextInt();

	System.out.println("Enter the marks of Computer");
	int cmp = ABC.nextInt();

	int totalMarks = phy + chem + bio + math + cmp;
        double percentage = (totalMarks * 100.0) / 500.0;

	System.out.println("Total percentage is " + percentage);

	if(percentage >= 90){
	System.out.println("Grade A");
	}
	else if (percentage >= 80 ){
	System.out.println("Grade B");
	}
	else if (percentage >= 70 ){
	System.out.println("Grade C");
	}
	else if (percentage >= 60 ){
	System.out.println("Grade D");
	}
	else if (percentage >= 40 ){
	System.out.println("Grade E");
	}
	else if (percentage <= 60 ){
	System.out.println("Grade F");
	}
	else {
	System.out.println("Enter the valid Marks");
	}
}
}




	
