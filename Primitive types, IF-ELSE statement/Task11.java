import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number:");
		int num = sc.nextInt();
		if (num < 100 || num > 999) {
			System.out.println("The entered number is not with 3 digits.");
		} else {
			int digit1 = num / 100;
			int digit2 = (num / 10) % 10;
			int digit3 = num % 10;
			if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
				System.out.println("The entered number contains zero.");
			} else {
				if (num % digit1 == 0 && num % digit2 == 0 && num % digit3 == 0) {
					System.out.println(num + " can be divided to its digits");
				} else {
					System.out.println(num + " can't be divided to its digits");
				}
			}
		}
	}
}
