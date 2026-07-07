package arraysdemo;

/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 2:24:53 PM
 * Email : sirinandini.a@gmail.com
 */

public class MatrixAddition {

	public static void main(String[] args) {
		// Define two 2x3 matrices
		int[][] matrix1 = {
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] matrix2 = {
				{7, 8, 9},
				{10, 11, 12}
		};

		// Create a result matrix with same size
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] result = new int[rows][cols];

		// Perform matrix addition
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Display the result
		System.out.println("Result of Matrix Addition:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(); // new line after each row
		}

	}

}
