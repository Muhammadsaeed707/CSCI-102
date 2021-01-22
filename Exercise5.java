import java.util.Scanner;

class Exercise5 
{ 
  public static void main(String args[])
  {
  	//Declare variables
  	int x;
  	int y;

  	// New Scanner object
	Scanner input = new Scanner(System.in);
	
	// Gets x, y values
	System.out.println("What is the first integer? ");
	x = input.nextInt();
	System.out.println("What is the second integer? ");
	y = input.nextInt();
	//blank line
	System.out.println();
	//prints results on lines
	System.out.println(x + y);
	System.out.println(x - y);
	System.out.println(x / y);
	System.out.println(x * y);
	System.out.println(x % y);
  }
}