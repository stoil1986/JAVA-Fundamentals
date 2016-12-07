import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А:");
		double num1 = sc.nextDouble();
		System.out.println("Въведете B:");
		double num2 = sc.nextDouble();
		System.out.println("Въведете C:");
		double num3 = sc.nextDouble();
		if (num3 > num1 && num3 < num2) {
			System.out.printf("Числото %.1f е между %.1f и %.1f", num3, num1, num2);
		} else {
			System.out.printf("Числото %.1f не е между %.1f и %.1f", num3, num1, num2);
		}		
	}
}
