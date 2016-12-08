import java.util.Scanner;

public class Task11A {

	public static void main(String[] args) {
		 
		System.out.println("The matrix is square!!!\nPlease input only one number.");
		Scanner sc = new Scanner(System.in);
		int rowsCols = sc.nextInt();

		int[][] arr = new int[rowsCols][rowsCols];

		int counter = 0;
		int numCounter = 1; 
		int j = 0;
		while (rowsCols - 1 > 0) {

			for (int i = counter; i < rowsCols; i++) {
				arr[i][j] = numCounter++;
			}
			for (int i = counter + 1; i < rowsCols; i++) {
				arr[rowsCols - 1][i] = numCounter++;
			}
			for (int i = rowsCols - 2; i >= counter; i--) {
				arr[i][rowsCols - 1] = numCounter++;
			}
			for (int i = rowsCols - 2; i >= counter + 1; i--) {
				arr[j][i] = numCounter++;
			}
			j++;
			counter++;
			rowsCols--;
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.printf("%3d ", arr[row][col]);
			}
			System.out.println();
		}
	}
}

// Result for rowsCols = 4

		// 1 12 11 10
		// 2 13 15 9
		// 3 14 16 8
		// 4 5  6  7
