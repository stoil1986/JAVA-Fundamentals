import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number in range [1..999]");
		int num = sc.nextInt();
		int count = 1;
		while (count <= 10) {
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				System.out.print(count + ":" + num + ", ");
				count++;
			}
			num++;
		}
	}
}
