import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1*num2;
		int division = num1/num2;
		int remainder = num1%num2;
		System.out.println("Sum = " + sum);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Multiplication = " + multiplication);
		System.out.println("Division = " + division);
		System.out.println("Remainder = " + remainder);
		
//		--Same operations with Double--
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number:");
//		double num1 = sc.nextDouble();
//		System.out.println("Enter second number:");
//		double num2 = sc.nextDouble();
//		double sum = num1 + num2;
//		double subtraction = num1 - num2;
//		double multiplication = num1*num2;
//		double division = num1/num2;
//		double remainder = num1%num2;	
//		System.out.println("Sum = " + sum);
//		System.out.println("Subtraction = " + subtraction);
//		System.out.println("Multiplication = " + multiplication);
//		System.out.println("Division = " + division);
//		System.out.println("Remainder = " + remainder);
		
	}

}
