import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи на първия масив");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Въведете брой елементи на втория масив");
		int length1 = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr1 = new int[length1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		boolean areEqual = true;
		if (length != length1) {
			areEqual = false;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					areEqual = false;
				}
			}
		}
		if (areEqual) {
			System.out.println("Масивите са еднакви");
		} else {
			System.out.println("Масивите са различни");
		}

	}

}
