
public class Task4 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1,2,3},			
				{5,6,7},			
				{9,10,11},
				{13,14,15},
			};
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = matrix.length-1; row >= 0; row--) {
				System.out.print(matrix[row][col]+ " "); 	
			}
			System.out.println();
		}
	}
}
