import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int n = sc.nextInt();
		int temp = n;
		int digitsCount = 0;
		while (temp != 0) {
			temp /= 2;
			digitsCount++;
		}
		if (digitsCount == 0) {
			digitsCount = 1;
		}
		int[] arr = new int[digitsCount];

		for (int i = arr.length-1; i >= 0; i--) {
			arr[i] = n % 2;
			n /= 2; 
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
