import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
		int count = 0;
		String binary_num = "";
		Scanner enter = new Scanner(System.in);
		System.out.print("Enter any decimal number: ");
		int num = enter.nextInt();
		enter.close();
		while (num > 0) {
			int a = num % 2;
			if(a == 1)
				count++;
			binary_num = a + "" + binary_num;
			num = num / 2;
		}
		System.out.println("Binary number: " + binary_num);
	}
}
