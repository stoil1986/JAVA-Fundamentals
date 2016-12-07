
public class Task3 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			    {4,7,3,11},			
				{0,91,5,2},			
				{3,5,66,4},														
			};
		double sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col]; 	
			}
		}
		double average = sum/(matrix.length*matrix[0].length);
		System.out.printf("Сумата е: %.2f \nСредноаритметичното е: %.2f",sum,average);
	}
}
