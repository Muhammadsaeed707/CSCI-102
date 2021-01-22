import java.util.Scanner;

public class Exercise8
{ 
  public static void main(String args[])
  {

  	// Create new scanner object
	Scanner input = new Scanner(System.in);
	
	// Collects from user fahrenheit value, and converts to value in celsius
	System.out.print("What temperature do you want converted from Fahrenheit to Celsius? ");
	double f = input.nextDouble();
	double c = (f-32)*(0.5556);

	// Outputs temperature in Celsius
	System.out.println(f + " degrees Farenheit is " + c + " degrees Celsius ");

  }
}
