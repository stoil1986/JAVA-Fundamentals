import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt(); 
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0) {
				System.out.print("skip " + i + ",");
			} else {
				sum += i;
				if (sum > 200) {
					break;
				}
				System.out.print(i * i + ",");
			}
		}
	}
}
