
public class Task12 {

	public static void main(String[] args) {

		for (int num = 100; num < 999; num++) {

			int digit1 = num / 100;
			int digit2 = (num / 10) % 10;
			int digit3 = num % 10;

			if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3) {
				continue;
			}			
			System.out.print(num + " ");			
		}
	}
}
