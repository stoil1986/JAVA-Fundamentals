
public class Task7 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {11,12,13,14,15,16},			
				{21,22,23,24,25,26},			
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56}, 
				{61,62,63,64,65,66},
			};
		int sum = 0;
		int totalSum = 0;
						
		for (int row = 0; row < matrix.length; row++) {	
			sum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if ((row + col) % 2 == 0) {
					sum += matrix[row][col];
					if (col >= matrix[row].length - 2) {
						System.out.print(matrix[row][col] + " ");
					}else {
						System.out.print(matrix[row][col] + ", ");
					}					 
				}			 	
			}
			totalSum += sum; 
			System.out.print(" Сума = " + sum);
			System.out.println();				 			
		}
		System.out.println("Сумата на елементите = " + totalSum);
	}
}
