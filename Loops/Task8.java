import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int startNum = 0;
		int numToAdd = 0;
		for (int i = 0; i < n; i++) {
			startNum += (n - 1) * Math.pow(10, i);
			numToAdd += 2 * Math.pow(10, i);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(startNum);
			startNum += numToAdd;
		}
	}
}
