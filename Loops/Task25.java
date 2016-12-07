import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int factorial = 1;
		do {
			factorial *= n--;
		} while (n > 0);
		System.out.println(factorial);
	}
}
