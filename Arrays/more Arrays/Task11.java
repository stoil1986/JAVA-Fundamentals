import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int rows = sc.nextInt();
		 int cols = sc.nextInt();
				 
		int[][] arr = new int[rows][cols];
		
		int numCounter = 2;		
		 arr[0][0] = 1;

		for (int row = 1; row < rows; row++) {		
			for (int col = 0; col <= row; col++) {
				arr[row-col][col] = numCounter++;
			}
		}	
		int increaseCol = 1;
		while (arr[rows-1][cols-1] == 0) {
		    int decreaseRow = 1;	
			for (int col = increaseCol; col < cols; col++) {
				arr[rows-decreaseRow][col] = numCounter++;
				decreaseRow++;
			}			
			increaseCol++;		
		}				
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
// Example with rows = 4, cols = 5: 
//  1 3 6 10 14 
//  2 5 9 13 17 
//  4 8 12 16 19 
//  7 11 15 18 20
