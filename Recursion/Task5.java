import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		Integer n = sc.nextInt();
							
		String numToStr = String.valueOf(n);
		char[] arr = numToStr.toCharArray();
		
        String result = reverseNum(arr,0);
        System.out.println(result);
        if (numToStr.equals(result)) {
			System.out.println("yes"); 
		}else {
			System.out.println("no"); 
		}			 			
	}
	 static String reverseNum(char[] ch, int i) {
		
		char temp = ch[i];
		ch[i] = ch[ch.length-i-1];
		ch[ch.length-i-1] = temp;
		
		if (i == ch.length/2) {
			return String.valueOf(ch);
		}		
		return reverseNum(ch , i+1);			
	}	
}


