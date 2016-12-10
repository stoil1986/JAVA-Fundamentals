import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input some text no longer than 40 symbols");
		String text1 = sc.nextLine();
		System.out.println("Input more text no longer than 40 symbols");
		String text2 = sc.nextLine();
		while (text1.length() > 40 || text2.length() > 40) {
			System.out.println("The inputted text is longer than 40 symbols\nPlease try again");
			text1 = sc.nextLine();
			text2 = sc.nextLine();
		}
		String result1 = text1.toUpperCase() + " " + text1.toLowerCase();
		String result2 = text2.toUpperCase() + " " + text2.toLowerCase();
		System.out.println(result1 + " " + result2);
	}
}
