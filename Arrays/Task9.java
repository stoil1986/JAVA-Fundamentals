import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length/2; i++) {			
			int temp = arr[i];
			arr[i] = arr[length-i-1];
			arr[length-i-1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
//		   --Решение 2--(С допълнителен масив)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Въведете брой елементи");
//		int length = sc.nextInt();
//		System.out.println("Въведете елементите на масива");
//
//		int[] arr = new int[length];
//		int[] arr1 = new int[length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {						
//			arr1[i] = arr[length-i-1];
//			System.out.print(arr1[i] + " ");
//		}		
	}
}
