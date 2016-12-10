import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a word:");
		String input = sc.nextLine();
		if (checkForPalindromes(input)) {
			System.out.println("The inputted word is palindrome.");
		}else {
			System.out.println("The inputted word is not palindrome.");
		}				
	}
	static boolean checkForPalindromes(String str){
		boolean isPalindrome = true;
		for (int i = 0; i <= str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}
