import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int divider = 2;
		boolean prime = true;
		int maxDivider = (int) Math.sqrt(n);
		for (int i = divider; i <= maxDivider; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not prime");
		}
	}
}
