import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input first word");
		String word1 = sc.nextLine();
		System.out.println("Input second word");
		String word2 = sc.nextLine();		
	   
		System.out.println();
		for (int i = 0; i < word1.length(); i++) { 
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					printWords(word1, word2, j, i);					
				}
			}			
		}		 
	}
	static void printWords(String str1,String str2,int index1,int index2 ){
		for (int i = 0; i < str2.length(); i++) {			 
			if (i == index1) {
				System.out.println(str1);
				continue;
			}
			System.out.println(makeSpaces(index2) + str2.charAt(i));	
		}
		System.out.println();
	}
	static String makeSpaces(int spaces){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < spaces; i++) {
			sb.append(' ');
		}
		return sb.toString();
	} 
}


