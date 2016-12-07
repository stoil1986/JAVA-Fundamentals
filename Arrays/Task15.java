
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи на масивa");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		double[] arr = new double[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		double sum = 0;
		double maxSum = 0;
		double num1 = 0; 
		double num2 = 0;
		double num3 = 0;
		double absNum1 = 0;
		double absNum2 = 0;
		double absNum3 = 0;
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (z = j + 1; z < arr.length; z++) {
					absNum1 = arr[i] < 0 ? arr[i] * (-1) : arr[i];
					absNum2 = arr[j] < 0 ? arr[j] * (-1) : arr[j];
					absNum3 = arr[z] < 0 ? arr[z] * (-1) : arr[z];
					sum = absNum1 + absNum2 + absNum3;
					if (sum > maxSum) {
						maxSum = sum;
						num1 = arr[i];
						num2 = arr[j];
						num3 = arr[z];
					}
				}
			}
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
