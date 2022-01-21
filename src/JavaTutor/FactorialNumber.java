package JavaTutor;

public class FactorialNumber {

	/*
	 * public static int Factorial(int num) { int fact = 1; if (num == 0) {
	 * 
	 * return 1; }
	 * 
	 * for (int i = 1; i <= num; i++) { fact = fact * i; }
	 * 
	 * return fact;
	 * 
	 * }
	 */

	public static int factor(int num) {

		if (num == 0) {

			return 1;
		} else {

			return num * factor(num - 1); // Recursive function : a function is
											// calling itself

		}

	}

	public static void main(String[] args) {
		/*
		 * int factnumber = Factorial(11);
		 * System.out.println("Factorial  of the given number" + " " +
		 * factnumber);
		 */

		System.out.println(factor(5));
	}

}
