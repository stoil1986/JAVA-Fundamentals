 import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час в интервал[0..24]:");
		byte hour = sc.nextByte();
		if (hour < 0 || hour > 24) {
			System.out.println("Въведеният час е извън този интервал!");
		} else {
			if ((hour >= 18 && hour <= 24) || (hour >= 0 && hour < 4)) {
				System.out.println("Добър вечер");
			} else if (hour >= 4 && hour < 9) {
				System.out.println("Добро утро");
			} else {
				System.out.println("Добър ден");
			}
		}
	}
}