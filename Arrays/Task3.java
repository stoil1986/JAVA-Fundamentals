import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		int n = sc.nextInt();
		int arr[] = new int[10];
		arr[0] = arr[1] = n;
		for (int i = 2; i < 10; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println("The elements of the massive are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
