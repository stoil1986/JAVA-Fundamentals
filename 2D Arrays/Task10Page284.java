import java.util.Scanner;

public class Task10Page284 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		int[][] matrix = new int[n][m];
		int counter = 1;
		for (int col = 0; col < matrix[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < matrix.length; row++) {
					matrix[row][col] = counter++;
					
				}
			} else{		 
				for (int row = matrix.length - 1; row >= 0; row--) {
					matrix[row][col] = counter++;
				}
			}
		}for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {				
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
