import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		System.out.println("Въведете четири координати в интервал [1..8]:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първа координата на поле 1:");
		int x1 = sc.nextInt();
		System.out.println("Въведете втора координата на поле 1:");
		int y1 = sc.nextInt();
		System.out.println("Въведете първа координата на поле 2:");
		int x2 = sc.nextInt();
		System.out.println("Въведете втора координата на поле 2:");
		int y2 = sc.nextInt();
		if ((x1 < 1 || x1 > 8) || (y1 < 1 || y1 > 8) || (x2 < 1 || x2 > 8) || (y2 < 1 || y2 > 8)) {
			System.out.println("Въведените координати не са в интервал [1..8]!");
		} else {
			int sum1 = x1+y1;
			int sum2 = x2+y2;
			boolean diff1 = (sum1 % 2 == 0) && (sum2 % 2 !=0);
			boolean diff2 = !(sum1 % 2 == 0) && !(sum2 % 2 !=0);
			if (diff1 || diff2) {
				System.out.println("Двете полета са с различен цвят");
			} else {
				System.out.println("Двете полета са с еднакъв цвят");
			}
		}
	}
}
