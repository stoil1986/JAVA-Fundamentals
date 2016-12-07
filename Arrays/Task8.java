import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int maxCount = 0;
		int maxIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			int count = 1;
			int j = i + 1;

			while (arr[i] == arr[j]) {
				count++;
				j++;
				if (j == arr.length) {
					break;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxIndex = i;
			}
		}
		for (int i = maxIndex; i < maxIndex + maxCount; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
