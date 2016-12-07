import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на квадратната матрица");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Въведете елементи на квадратната матрица");
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				matrix[row][col] = sc.nextInt();
			}
		}
		System.out.println("Диагоналите са: ");
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row == col) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		System.out.println();
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row == n - col - 1) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
	}
}
