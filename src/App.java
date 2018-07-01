import java.util.Scanner;

public class App {

	// Write a function that takes a list of numbers, and returns the biggest number
	// in the list.

	public static void LargestComparator() {

		System.out.println("Enter three integers");

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is largest");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is largest");
		} else if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("all integers are the same");
		}
		scanner.close();
	}

	public static void main(String[] args) {

		App.LargestComparator();
	}

}
