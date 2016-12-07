import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 3; i <= 3 * n; i += 3) {
			if (i == 3 * n) {
				System.out.println(i);
				break;
			}
			System.out.print(i + ",");
		}
	}
}
