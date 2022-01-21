package JavaTutor;

import java.util.Scanner;

public class PalindromeNumber {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp, reverse_number = 0, reminder;

		temp = number;

		while (number > 0) {

			reminder = number % 10;
			reverse_number = reverse_number * 10 + reminder;
			number = number / 10;
		}

		if (temp == reverse_number) {

			System.out.println("Number is a palindrome");
		} else {

			System.out.println("Number is not a palindrome");

		}

	}

}
