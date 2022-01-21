package JavaTutor;

import java.util.Scanner;

public class ArmStrong {

static Scanner  in;
	public static void main(String[] args) {
		//isArmStrong(555);
		in = new Scanner(System.in);
		
		int arm_strong = in.nextInt();
		
		isArmStrong(arm_strong);

	}

	public static void isArmStrong(int num) {

		int reminder;
		int cube = 0;
		int temp;
		temp = num;

		while (num > 0) {

			reminder = num % 10; // will be the last digit of the given number
			num = num / 10; // will discard the last digit of the given number
			cube = cube + (reminder * reminder * reminder);

		}

		if (temp == cube) {
			System.out.println("Number is an Armstrong Number");

		} else {
			System.out.println("Number is not an Armstrong Number");
		}
	}

}
