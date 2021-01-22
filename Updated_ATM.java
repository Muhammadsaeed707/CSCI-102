import java.util.Scanner;
	public class Exercise1 {
	public static double num1(double a1) {
		System.out.println("Your current balance is " + a1);
		return a1;
	}
	public static double num2(double balance2) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double deposit = scan1.nextDouble();
		double a2 = balance2 + deposit; 
		return a2; 
	}
	public static double num3(double balance3) {
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter the amount you want to withdraw: ");
		double withdraw = scan2.nextDouble();
		double a3 = balance3 - withdraw; 
		if (balance3 < 0)
			System.out.println("Sorry you don't have enough balance");
		return a3;
	}
	public static double num4(double balance4) {
		System.out.println("Goodbye");
		return balance4;
	}
	public static void main(String [] args) {
		Scanner enter = new Scanner(System.in);
		double balance = 100.00;
		do {
		System.out.println("1. View your account balance ");
		System.out.println("2. Deposit Cash ");
		System.out.println("3. Withdraw cash");
		System.out.println("4. Exit");
		System.out.println("");
		System.out.print("Enter your selection: ");
		String response = enter.next();
		System.out.println("");
		if (response.equals("1"))
			num1(balance);

		else if (response.equals("2"))
			balance = num2(balance);

		else if (response.equals("3")) 
			balance = num3(balance);

		else if (response.equals("4")) {
			num4(balance);
			break;
		}
		} while (true);
	}
}
