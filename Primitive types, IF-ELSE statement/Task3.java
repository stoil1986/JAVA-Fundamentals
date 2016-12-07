import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		int oldNum1 = num1;
		num1 = num2;
		num2 = oldNum1;
		System.out.println("First number = " + num1 + "\n" + "Second number = " + num2);
	}
}
