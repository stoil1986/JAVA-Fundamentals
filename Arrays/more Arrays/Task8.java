
public class Task8 {

	public static void main(String[] args) {
		
		boolean matrix[][] = {
				{false,false,true,false},
				{false,false,false,false},
				{false,true,false,false},
				{false,false,false,true},
			};
		boolean isIn = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length-i-1; j++) {
				if (matrix[i][j] == true){
					isIn = true;
					break;
				}
			}
		}
		if (isIn) {
			System.out.println("in");
		}else {
			System.out.println("out");
		}
	}
}
