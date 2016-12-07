
public class Task23 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		while (num1 <= 9) {
			num2 = num1;
			while (num2 <= 9) {				
				System.out.print(num1 + "*" + num2 + "; ");
				num2++;
			}
			num1++;
			System.out.println();
		}
	}

}
