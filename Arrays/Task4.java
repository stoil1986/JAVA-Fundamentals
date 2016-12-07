import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isReflect = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[length - i - 1]) {
				isReflect = false;
			}
		}
		if (isReflect) {
			System.out.println("Масивът е огледален");
		} else {
			System.out.println("Масивът не е огледален");
		}
	}
}
