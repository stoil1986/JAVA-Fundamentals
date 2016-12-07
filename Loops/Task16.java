import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number in range [10..5555]");
		int n = sc.nextInt();
		System.out.println("Input second number in range [10..5555]");
		int m = sc.nextInt();
		if (n < 10 || n > 5555 || m < 10 || m > 5555) {
			System.out.println("The inputted numbers are out of range");
		} else {
			int max = Math.max(m, n);
			int min = Math.min(m, n); 
			for (int i = max; i > min; i--) {
				if (i % 50 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
