import java.util.Scanner;
	public class Exercise7 {
	public static void main(String [] args) {
		Scanner enter = new Scanner(System.in);
		double balance = 0.00;
		while (true){
		System.out.println("1. View your account balance ");
		System.out.println("2. Deposit Cash ");
		System.out.println("3. Withdraw cash");
		System.out.println("4. Exit");
		System.out.println("");
		System.out.print("Enter your selection: ");
		String response = enter.next();
		System.out.println("");
		if (response.equals("1"))
			System.out.println("Your current balance is " + balance);
		else if (response.equals("2")) {
			System.out.print("Enter the amount you want to deposit: ");
			double deposit = enter.nextDouble();
			balance = balance + deposit; }
		else if (response.equals("3")) {
			System.out.print("Enter the amount you want to withdraw: ");
			double withdraw = enter.nextDouble();
			balance = balance - withdraw; 
			if (balance < 0)
				System.out.println("Sorry you don't have enough balance");
		}
		else if (response.equals("4"))
			break;
		}
		System.out.println("Goodbye");
	}
}
