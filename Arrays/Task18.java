import java.util.Scanner;

public class Task18 {

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
		System.out.print("Елементите на първия масив са: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nЕлементите на втория масив са: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		int[] resultArr = new int[length];
		System.out.print("\nНовополученият масив е: ");
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = arr[i] > arr1[i] ? arr[i] : arr1[i];
			System.out.print(resultArr[i] + " ");
		}
	}

}
