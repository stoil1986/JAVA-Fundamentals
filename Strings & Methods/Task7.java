import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input some words space separated!");
		String[] input = sc.nextLine().split(" ");
		int wordLength = 0;
		int maxWordLength = 0;
		for (int i = 0; i < input.length; i++) {
			wordLength = input[i].length();
			if (wordLength > maxWordLength) {
				maxWordLength = wordLength; 
			}
		}
		System.out.println(input.length + " words, the longest is with " + maxWordLength + " symbols." );
	}
}
