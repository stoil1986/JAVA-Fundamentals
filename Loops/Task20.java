
public class Task20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9; j++) {
				System.out.print(j);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}			 			 
			System.out.println();						
		}
		for (int j = 0; j <=9 ; j++) {
			System.out.print(j);
		}
	}
}
