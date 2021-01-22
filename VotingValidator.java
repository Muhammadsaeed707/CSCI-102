import java.util.Scanner;
public class VotingValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int num = input.nextInt();
		try {
			ValidateAge(num);
		} 
		catch(InvalidAgeException err) {
			System.out.println(err.getMessage());
		}
	}

	public static void ValidateAge(int num) throws InvalidAgeException {
		int num1 = 2020 - num;
		if (num1 >= 21) {
			System.out.println("Welcome to Vote!");
		}
		else {
			throw new InvalidAgeException(num, num1);
		}
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(int num, int num1) {
		super("Error: User was born in " + num + " and he/she will be " + num1 + " by the next election.");
	}
}
