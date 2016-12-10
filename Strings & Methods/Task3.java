import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a non separated string");
		String text1 = sc.nextLine();
		System.out.println("Input one more non separated string");
		String text2 = sc.nextLine();
		if (text1.length() == text2.length()) {
			System.out.println("Two strings are with same length");
			CheckPositions(text1, text2,text1.length());
		} else {
			System.out.println("Two strings are with differrent length");
			int smallerLength = text1.length() < text2.length() ? text1.length() : text2.length();
			int biggerLength = text1.length() > text2.length() ? text1.length() : text2.length();
			int difference = biggerLength - smallerLength;
			
			String shorterText = text1.length() < text2.length() ? text1 : text2;
			String textWithAddedSpaces = addSpaces(shorterText, difference);
			String otherText = text1.length() > text2.length() ? text1 : text2;
			
			CheckPositions(textWithAddedSpaces, otherText, biggerLength);
		}	
	} 
	
	static String addSpaces(String str, int diff) {
		StringBuilder build = new StringBuilder(str);
		for (int i = 0; i < diff; i++) {
			build.append(" ");
		}
		return build.toString();					 
	}
	
    static void CheckPositions(String str1, String str2, int length){
    	System.out.println("Difference by positions:");
    	for (int i = 0; i < length; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.println(i + 1 + " " + str1.charAt(i) + "-" + str2.charAt(i));
			}
		}
    }
}
