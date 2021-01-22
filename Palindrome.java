import java.util.Scanner;
	public class Exercise3 {
		public static String r1(String a) {
			String new_word = "";
			int j = a.length()-1;
			for (int i = 0; i < a.length(); i++) {
				new_word += a.charAt(j);
				j = j-1;
			}
			if (new_word.equals(a))
				System.out.println(a + " is a palindrome");
			else
				System.out.println(a + " is not a palindrome");
			return a;
		}
		public static void main(String[] args) {
			Scanner enter = new Scanner(System.in);
			System.out.print("Enter word to check if palindrome: ");
			String answer1 = enter.nextLine();
			String answer2 = answer1.replaceAll(" ", "");
			String answer = answer2.toLowerCase();
			enter.close();
			r1(answer);
		}
	}
