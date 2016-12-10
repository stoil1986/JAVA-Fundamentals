import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 2 names separated with comma!");
		String[] input = sc.nextLine().split(",");
		String name1 = input[0];
		String name2 = input[1];
		int sum1 = SumChars(name1);
		int sum2 = SumChars(name2);
		String maxSumName = sum1 > sum2 ? name1 : name2;
		System.out.println(maxSumName);
	}
	static int SumChars(String str){
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sum += str.charAt(i);
			}
		}
		return sum;
	}
}
