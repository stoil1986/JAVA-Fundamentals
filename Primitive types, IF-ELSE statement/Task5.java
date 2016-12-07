import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("The order is " + num1 + " " + num2 + " " + num3);
			} else {
				System.out.println("The order is " + num1 + " " + num3 + " " + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("The order is " + num2 + " " + num1 + " " + num3);
			} else {
				System.out.println("The order is " + num2 + " " + num3 + " " + num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println("The order is " + num3 + " " + num1 + " " + num2);
			} else {
				System.out.println("The order is " + num3 + " " + num2 + " " + num1);
			}
		}
	}
}
