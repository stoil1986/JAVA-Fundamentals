import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете сума в граници [2..27]");
		int sum = sc.nextInt();
		if (sum < 2 || sum > 27) {
			System.out.println("Въведената сума не е в твзи граници");
		} else {
			for (int num = 100; num <= 999; num++) {

				int digit1 = num / 100;
				int digit2 = (num / 10) % 10;
				int digit3 = num % 10;

				if (sum == digit1 + digit2 + digit3) {
					System.out.print(num + " ");
				}
			}
		}
	}
}
