import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();

		for (int i = n; i <= 52; i++) {
		
			int cardSuit = i % 4;
			int cardNumber = (i - 1) / 4 + 1;

			switch (cardNumber) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.print(cardNumber+1);
				break;
			case 10:
				System.out.print("Вале");
				break;
			case 11:
				System.out.print("Дама");
				break;
			case 12:
				System.out.print("Поп");
				break;
			case 13:
				System.out.print("Aсо");
				break;
			}
			switch (cardSuit) {
			case 1:
				System.out.print(" Спатия");
				break;
			case 2:
				System.out.print(" Каро");
				break;
			case 3:
				System.out.print(" Купа");
				break;
			case 0:
				System.out.print(" Пика");
				break;
			}
			if (i < 52) {
				System.out.print(", ");
			}
		}
	}
}
