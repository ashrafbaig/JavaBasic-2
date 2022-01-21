package JavaTutor;

import java.util.Scanner;

public class Reverse_the_string {
	static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		String content = in.nextLine();

		StringBuilder sb = new StringBuilder();
		int string_length = content.length();

		for (int i = string_length - 1; i >= 0; i--) {
			sb.append(content.charAt(i));

		}
		System.out.println(sb.toString());

		if (sb.toString().equals(content)) {
System.out.println("string is palindrome");
		}else{
			
			System.out.println("string in not palindrome");
		}
	}

}
