
public class Task9 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1,2,3,4},			
				{55,6,7,8},			
				{9,10,11,12},
				{13,14,15,16},
			};
		int sum = 0;
		int maxSum = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = 0; j < matrix[0].length-1; j++) {
				sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
				if (sum > maxSum) {
					maxSum = sum;
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(matrix[index1][index2] + " " + matrix[index1][index2+1]);
		System.out.println(matrix[index1+1][index2] + " " + matrix[index1+1][index2+1]);
	}
}
