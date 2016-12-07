import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден:");
		int day = sc.nextInt();
		System.out.println("Въведете месец:");
		int month = sc.nextInt();
		System.out.println("Въведете година:");
		int year = sc.nextInt();

		boolean leapYear = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));

		boolean correctData = true;
		if ((day < 0 || day > 31) || (month < 0 || month > 12) || (year < 0)) {
			correctData = false;
		} else if (day == 29 && month == 2 && !leapYear) {
			correctData = false;
		}
		if (day == 28 && month == 2) {
			if (leapYear) {
				day++;
			} else {
				day = 1;
				month++;
			}
		} else if (day == 29 && month == 2 && leapYear) {
			day = 1;
			month++;
		} else if (day == 30) {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day++;
				break;
			case 2:
				correctData = false;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 1;
				month++;
				break;
			}
		} else if (day == 31) {
			if (month == 2) {
				correctData = false;
			}
			day = 1;
			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		} else {
			day++;
		}
		if (correctData) {
			System.out.println("Следващата дата е");			
			System.out.printf("%02d.%02d.%02d",day,month,year);
		}else {
			System.out.println("Невалидна дата");
		}
	}
}
