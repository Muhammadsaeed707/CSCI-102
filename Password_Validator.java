import java.util.Scanner;
	public class Exercise1{
	public static void main(String [] args){
	Scanner enter = new Scanner(System.in);
	System.out.print("Please enter your password: ");
	String pw = enter.next();
	enter.close();
	if (pw.equals("NYU42day"))
	System.out.println("Valid Password");
	else 
	System.out.println("Invalid Password");
	}
}
