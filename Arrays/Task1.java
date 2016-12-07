import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if (arr[i] % 3 == 0) {			
				if (arr[i] < min) {
					min = arr[i];
				}				
			}
		}
		System.out.println(min);		
	}
}
