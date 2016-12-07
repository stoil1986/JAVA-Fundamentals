import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number in range [10..99]");
		int num = sc.nextInt();
		while (num > 0) {
			 
			System.out.println(num);
			if (num == 1) {
				break;
			}
			if (num % 2 == 0) {
				num *= 0.5;
			} else {
				num = num * 3 + 1;
			}
		}				
	}
}
