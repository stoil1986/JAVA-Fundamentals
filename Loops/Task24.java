import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in range [0..30000]:");
		int num = sc.nextInt();
		int copyOfNum = num;
		int reverse = 0;
		do {
			reverse *= 10;
			reverse += copyOfNum % 10;
			copyOfNum /= 10;
		} while (copyOfNum > 0);
		
		if (reverse == num) {
			System.out.println(num + " is palindrome");
		} else {
			System.out.println(num + " is not palindrome");
		}
	}
}
