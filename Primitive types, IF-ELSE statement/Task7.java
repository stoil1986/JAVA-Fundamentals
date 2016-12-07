import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете сума пари:");
		float money = sc.nextFloat();
		System.out.println("Въведете \"true\" за здрав или \"false\" за болен:");
		Boolean isHealthy = sc.nextBoolean();
		if (!isHealthy) {
			if (money > 10) {
				System.out.println("Ще си купя лекарства");
			} else {
				System.out.println("Ще пия чай");
			}
		}else {
			if (money > 10) {
				System.out.println("Ще отида на кино с приятел");
			} else {
				System.out.println("Ще изляза да се разходя");
			}
		}
	}

}