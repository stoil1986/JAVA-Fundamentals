import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		System.out.println("Enter four digit number:");
		Scanner sc = new Scanner(System.in);
		short number = sc.nextShort();
		if (number < 1000 || number > 9999) {
			System.out.println("The entered number is not with 4 digits.");
		} else {
			short digit1 = (short) (number / 1000);
			short digit4 = (short) (number % 10);
			byte num1 = (byte) (digit1 * 10 + digit4);

			short digit2 = (short) (number / 100);
			digit2 %= 10;
			short digit3 = (short) (number / 10);
			digit3 %= 10;
			byte num2 = (byte) (digit2 * 10 + digit3);
			
			if (num1 < num2) {
				System.out.println(num1 + "<" + num2);
			} else if (num1 == num2) {
				System.out.println(num1 + "=" + num2);
			} else {
				System.out.println(num1 + ">" + num2);
			}
		}

	}
}
