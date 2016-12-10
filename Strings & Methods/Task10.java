import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string");
		String input = sc.nextLine();
		String result = makeNewString(input);
		System.out.println(result);
	}
	static String makeNewString(String str){
		StringBuilder sb = new StringBuilder();
		char resultChar;
		for (int i = 0; i < str.length(); i++) {
			resultChar = (char) (str.charAt(i) + 5);
			sb.append(resultChar);
		}
		return sb.toString();
	}
}
