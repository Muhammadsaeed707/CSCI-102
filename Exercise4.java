import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		System.out.print("Enter array length and following amount of integers: ");
		int numbers[] = new int[input.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		if (sort(numbers) == false)
			System.out.println("The array is not sorted");
		else
			System.out.println("The array is sorted");
	}
	public static boolean sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i + 1])
				return false;
		}
		return true;
	}
}