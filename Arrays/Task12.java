import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете масив със седем елемента");
		int[] arr = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];

		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		System.out.println("Новият масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
