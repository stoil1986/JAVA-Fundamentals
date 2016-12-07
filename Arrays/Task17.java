import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		boolean isZigzag = true;
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}		
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					isZigzag = false;
					break;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					isZigzag = false;
					break; 
				}
			}
		}
		if (isZigzag) {
			System.out.println("Редицата е зигзагообразна нагоре");
		} else {
			System.out.println("Редицата НЕ е зигзагообразна нагоре");
		}
	}
}
