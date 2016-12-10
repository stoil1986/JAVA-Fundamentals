import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentance!");
		String[] input = sc.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			char firstLetter = word.charAt(0);
			char letter1ToUpper = Character.toUpperCase(firstLetter);
			word = word.replace(word.charAt(0), letter1ToUpper);
			System.out.print(word + " ");
			
//          тяло на цикъла в един ред код (трудно разбираемо,но работи)
//			System.out.print(input[i].replace(input[i].charAt(0), Character.toUpperCase(input[i].charAt(0)))+ " ");
		}
	}
}
