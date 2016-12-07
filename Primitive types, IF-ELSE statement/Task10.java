import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете обем на резервоара:");
		int tankCapacity = sc.nextInt();
		if (tankCapacity < 10 || tankCapacity > 9999) {
			System.out.println("Въведеният обем на резервоара е извън границите [10..9999]!");
		} else {
			int timesToFill = tankCapacity / (2 + 3);
			int litersToAdd = (tankCapacity % 5);
			if (litersToAdd == 1) {
				timesToFill--;
			}
			System.out.println(timesToFill + " пъти x 2 литра");
			System.out.println(timesToFill + " пъти x 3 литра");
			if (litersToAdd == 1) {								
				System.out.println("2 допълнителни кофи от 3 литра");
			} else if (litersToAdd == 2) {
				System.out.println("допълнително кофа от 2 литра");
			} else if (litersToAdd == 3) {
				System.out.println("допълнително кофа от 3 литра");
			} else if (litersToAdd == 4) {
				System.out.println("2 допълнителни кофи от 2 литра");
			}
			 			
		}		
	}
}
