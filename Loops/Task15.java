import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int sum = 0;
		do {
			sum += n--;
		} while (n > 0);
		System.out.println(sum);
	}
}
