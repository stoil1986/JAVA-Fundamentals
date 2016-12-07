import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] resultArr = new int[arr.length];

		for (int i = 0; i < arr.length / 2; i++) {
			resultArr[i] = arr[i];
		}

		for (int i = arr.length / 2; i < resultArr.length; i++) {
			resultArr[i] = arr[length - 1];
			length--;
		}
		System.out.println("Новият масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}

	}

}
