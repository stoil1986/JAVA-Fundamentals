import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 words on same line ,space separated");
		String word1 = sc.next();
		String word2 = sc.next();
		String subWord1 = word1.substring(0, 5);
		String subWord2 = word2.substring(0, 5);		
		int biggerLength = word1.length() > word2.length() ? word1.length() : word2.length();
		word1 = word1.replace(subWord1, subWord2);
		word2 = word2.replace(subWord2, subWord1);
		String longerWord = word1.length() > word2.length() ? word1 : word2;
		System.out.print(biggerLength + " " + longerWord);	
	} 
}
