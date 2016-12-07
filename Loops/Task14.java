import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number in range [10..200]");
		int n = sc.nextInt();
		if (n < 10 || n > 200) {
			System.out.println("The inputted number is out of range");
		} else {
			for (int i = n; i > 10; i--) {
				if (i % 7 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
