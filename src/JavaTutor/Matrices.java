package JavaTutor;

public class Matrices {

	public static void main(String[] args) {
		int a[][] = { { 1, 4, 3 }, { 3, 4, 5 }, { 2, 3, 1 } };

		int b[][] = { { 1, 8, 3 }, { 3, 5, 5 }, { 2, 7, 1 } };

		int row1 = a.length;
		int cols1 = a[0].length;

		int row2 = b.length;
		int cols2 = b[0].length;

		int ResultMatrix[][] = new int[row1][cols2];

		if (cols1 != row2) {
			System.out.println("Mulripkication of the given Matrices is not possible");
		} else {
			int sum = 0;
			for (int i = 0; i < row1; i++) {

				for (int j = 0; j < cols2; j++) {

					for (int k = 0; k < cols1; k++) {

						sum = sum + a[i][k] * b[k][j];

					}
					ResultMatrix[i][j] = sum;
					sum = 0;

				}
			}

		}

		for (int i = 0; i < row1; i++) {

			for (int j = 0; j < cols2; j++) {

				System.out.print(ResultMatrix[i][j] + " ");

			}
			System.out.println();
		}
	}

}
