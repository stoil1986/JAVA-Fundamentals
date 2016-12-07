import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете масив със седем елемента");

		int[] arr = new int[7];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double average = sum / arr.length;
		double diff = 0;
		double minDiff = Double.MAX_VALUE;
		int minIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			diff = Math.abs(arr[i] - average);
			if (diff < minDiff) {
				minDiff = diff;
				minIndex = i;
			}
		}
		System.out.printf("Средна стойност: %.2f \n", average);

		System.out.println("Най-близък елемент: " + arr[minIndex]);
	}

}
