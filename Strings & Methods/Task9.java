import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string with digits, letters and symbol \"-\":");
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '-') {
				sb.append(input.charAt(i));

				if (i == input.length() - 1) {
					sum += Integer.parseInt(sb.toString());
					System.out.println(sb);
					break;
				}
				if (input.charAt(i + 1) == '-' || Character.isLetter(input.charAt(i + 1))) {
					sum += Integer.parseInt(sb.toString());
					System.out.println(sb);
					sb.delete(0, sb.length());
				}
			}
		}
		System.out.println(sum);
	}
}
