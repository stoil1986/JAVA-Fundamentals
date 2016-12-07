import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Âúâåäåòå À:");
		double num1 = sc.nextDouble();
		System.out.println("Âúâåäåòå B:");
		double num2 = sc.nextDouble();
		System.out.println("Âúâåäåòå C:");
		double num3 = sc.nextDouble();
		if (num3 > num1 && num3 < num2) {
			System.out.printf("×èñëîòî %.1f å ìåæäó %.1f è %.1f", num3, num1, num2);
		} else {
			System.out.printf("×èñëîòî %.1f íå å ìåæäó %.1f è %.1f", num3, num1, num2);
		}		
	}
}
