
public class Task5 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1,2,3,4},			
				{5,6,7,8},			
				{9,10,11,12},
				{13,14,15,16},
			};
		int sumRow = 0;
		int sumCol = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;
				
		for (int row = 0; row < matrix.length; row++) {
			sumRow = 0;
			sumCol = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sumRow += matrix[row][col];
				if (sumRow > maxSumRow) {
					maxSumRow = sumRow;					
				}
				sumCol += matrix[col][row];
				if (sumCol > maxSumCol) {
					maxSumCol = sumCol;
				}
			}
		}
		if (maxSumRow > maxSumCol) {
			System.out.println("Максималната сума по редове е > от максималната сума по колони");
		}else if (maxSumRow == maxSumCol) {
			System.out.println("Максималната сума по редове е = на максималната сума по колони");
		}else {
			System.out.println("Максималната сума по редове е < от максималната сума по колони");
		}
	}

}
