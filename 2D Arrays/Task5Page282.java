
public class Task5Page282 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1,2,3,4},			
				{5,6,7,8},			
				{1,1,11,12},
				{1,2,3,16},
			};		
		int product = 1;		
		for (int row = 0; row < matrix.length; row++) {			
			for (int col = 0; col < row; col++) {
				product *= matrix[row][col];
			}
		}
		System.out.println(product);
	}

}
