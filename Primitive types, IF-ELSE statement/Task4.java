import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();		
		int min = num1;
		int max = num2;
		if (num2 < min) {
			min = num2;
			max = num1;
		}
		System.out.println("The order is " + min + " " + max);
		
//      --Solution 2--
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number:");
//		int num1 = sc.nextInt();
//		System.out.println("Enter second number:");
//		int num2 = sc.nextInt();
//		System.out.println(Math.min(num1, num2) + " " + Math.max(num1, num2));
	}

}
