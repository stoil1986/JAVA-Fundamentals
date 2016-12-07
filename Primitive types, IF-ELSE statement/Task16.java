 import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число:");
		int num = sc.nextInt();
		if (num < 100 || num > 999) {
			System.out.println("Въведеното число не е с 3 цифри.");
		} else {
			int digit1 = num / 100;
			int digit2 = (num / 10) % 10;
			int digit3 = num % 10;
			
			if (digit1 == digit2 && digit2 == digit3) {
				System.out.println("Цифрите са равни");
			}else if (digit1 > digit2 && digit2 > digit3) {
				System.out.println("Цифрите са в низходящ ред");
			}else if (digit1 < digit2 && digit2 < digit3) {
				System.out.println("Цифрите са във възходящ ред");
			}else {
				System.out.println("Цифрите са ненаредени");
			}
		}
	}
}
