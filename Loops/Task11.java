
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ----Solution2-----> 

		// Scanner sc = new Scanner(System.in);
		// System.out.print("n = ");
		// int n = sc.nextInt();
		// System.out.println(repeatStr(" ", n-1)+"*");
		// for (int row = 1; row <= n - 2; row++) {
		// System.out.print(repeatStr(" ", n - row-1));
		// System.out.print("*" + repeatStr(" ", 2 * row - 1) + "*");
		// System.out.println();
		// }
		// System.out.println(repeatStr("*", 2*n-1));
	}

//	 public static String repeatStr(String str, int count) {
//	 StringBuilder repeated = new StringBuilder();
//	 for (int i = 0; i < count; i++) {
//	 repeated.append(str);
//	 }
//	 return repeated.toString();
//	 }

}
