package JavaTutor;

public class BubbleSorting {

	public static void bubbleSorting(int[] array) {
		int array_lenght = array.length;
		int temp = 0;

		for (int i = 0; i < array_lenght; i++) {

			for (int j = 0; j < (array_lenght - 1); j++) {

				// For Ascending order array[j] > array[j + 1] & for descending
				// order array[j] < array[j + 1]

				if (array[j] > array[j + 1]) {

					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 45, 34, 78, 54 };
		int array_lenght = array.length;
		for (int i = 0; i < array_lenght; i++) {
			System.out.println(array[i] + " Before bubble sorting");

		}
		bubbleSorting(array);
		System.out.println("------------------------------------------");
		for (int i = 0; i < array_lenght; i++) {

			System.out.println(array[i] + " After bubble sorting");

		}
	}

}
