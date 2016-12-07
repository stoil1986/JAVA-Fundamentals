import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[length];
		arr1[0] = arr[0];
		arr1[length - 1] = arr[length - 1];

		for (int i = 1; i < arr1.length - 1; i++) {
			arr1[i] = arr[i - 1] + arr[i + 1];
		}
		System.out.println("Новият масив е:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
