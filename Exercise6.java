import java.util.Scanner;

class Exercise6
{ 
  public static void main(String args[])
  {

  	// New scanner
	Scanner input = new Scanner(System.in);
	
	//Get value to be converted
	System.out.println("What value do you want converted to miles)? ");
	double km = input.nextDouble();

	// Outputs distance in miles
	System.out.println(km * .6214 + " miles ");

  }
}