import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		byte num1 = sc.nextByte();
		System.out.println("Enter second number:");
		byte num2 = sc.nextByte();
		if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
			System.out.println("The entered number is not with 2 digits.");
		}else {
			short multiplication = (short) (num1 * num2);
			byte lastDigit = (byte) (multiplication % 10);
			if (lastDigit % 2 == 0) {
				System.out.println(lastDigit + ", even");
			} else {
				System.out.println(lastDigit + ", odd");
			}
		}		 
	}
}
