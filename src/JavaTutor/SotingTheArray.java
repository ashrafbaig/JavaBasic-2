package JavaTutor;

public class SotingTheArray {

	public static void main(String[] args) {
		int a[] = { 10, 25, 45, 60, 50 };
		int lenght = a.length;

		int temp = 0;

		System.out.println("Array before sorting");
		for (int i = 0; i < lenght; i++) {

			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("============================");

		for (int i = 0; i < lenght; i++) {

			for (int j = i + 1; j < lenght; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println("Array after sorting in Ascending order");
		for (int i = 0; i < lenght; i++) {

			System.out.print(a[i] + " ");
		}

	}

}
