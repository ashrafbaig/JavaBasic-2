package JavaTutor;

public class Questions {

	public static void main(String[] args) {

		int number = 17;
		int flag = 0;
		int m = 0;
		m = number / 2;

		if (number <= 1) {

			System.out.println(number + " Number is not a valid Prime Number");

		} else {

			for (int i = 2; i <= m; i++) {

				if (number % i == 0) {

					System.out.println(number + " Number is not a Prime Number");
					flag = 1;

					break;
				}
			}

			if (flag == 0) {

				System.out.println(number + " Number is a Prime Number");

			}

		}
		/////////////////////////////////////////////////////////////////////////////

		String name = "Pattrik Viera";
		String temp = "", reverse = "";
		int str_lenght = name.length() - 1;

		for (int i = 0; i <= str_lenght; i++) {
			temp = temp + name.charAt(i);
			if (i == str_lenght || name.charAt(i) == ' ') {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse = reverse + temp.charAt(j);
					if (j == 0 && i != str_lenght) {

						reverse = reverse + " ";

					}

				}

				temp = "";

			}

		}

		System.out.println(reverse);

		/////////////////////////////////////////////////////////////

		int fabo = 8;
		int num1 = 0, num2 = 1, temp1 = 0;

		for (int i = 0; i <= fabo; i++) {

			System.out.print(num1 + " ");

			temp1 = num1 + num2;
			num1 = num2;
			num2 = temp1;
		}
		System.out.println();
		System.out.println("================================");
		///////////////////////////////////////

		int given_number = 000000000;
		int number_reverse = 0, reminder;
		int palindrome_number = given_number;

		while (given_number != 0) {

			reminder = given_number % 10;
			given_number = given_number / 10;
			number_reverse = number_reverse * 10 + reminder;

		}
		if (number_reverse == palindrome_number) {
			System.out.println(palindrome_number + " :- Number is a Palindrome Number");

		} else {
			System.out.println(palindrome_number + " :- Number is not a Palindrome Number");

		}

		System.out.println("================================");

		String character_count = "Visca Barca";
		int len = character_count.length();
		int[] count = new int[256];
		char[] ch = new char[len];
		
		for (int i = 0; i < len; i++)
			count[character_count.charAt(i)]++;

		for (int i = 0; i < len; i++) {
			ch[i] = character_count.charAt(i);
			int flag1 = 0;
			for (int j = 0; j <= i; j++) {
				if (character_count.charAt(i) == ch[j]) {
					flag1++;

				}

			}
			if (flag1 == 1) {
				System.out.println(character_count.charAt(i) + ":is " + count[character_count.charAt(i)]);
			}
		}

	}

}
