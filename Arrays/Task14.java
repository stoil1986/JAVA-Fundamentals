import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи на масивa");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		double[] arr = new double[length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				counter++;
			}
		}
		double[] resultArr = new double[counter];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				resultArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}
