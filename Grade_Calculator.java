import java.util.Scanner;

public class Exercise7
{ 
  public static void main(String args[])
  {

  	// Create new scanner object
	Scanner input = new Scanner(System.in);
	
	// Get user input  
	System.out.print("Enter desired grade> ");
	String grade_desired = input.nextLine();

	System.out.print("Enter minimum average required> ");
	double min_avg = input.nextDouble();

	System.out.print("Enter current average in course> ");
	double current_avg = input.nextDouble();

	System.out.print("Enter how much the final counts as a percentage of the course grade> ");
	double final_weight = input.nextDouble();

	// Convert weight of final to decimal 
	double final_weight_decimal = final_weight / 100;

	// Calculate score 
	double score_required = (min_avg - (current_avg * (1 - final_weight_decimal))) / (final_weight_decimal);

	// Outputs score necessary to receive the desired grade
	System.out.printf("You need a score of %.1f on the final to get a(n) %s", score_required, grade_desired);
	System.out.println();

  }
}
