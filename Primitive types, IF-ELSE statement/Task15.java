import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��� � ��������[0..24]:");
		byte hour = sc.nextByte();
		if (hour < 0 || hour > 24) {
			System.out.println("���������� ��� � ����� ���� ��������!");
		} else {
			if ((hour >= 18 && hour <= 24) || (hour >= 0 && hour < 4)) {
				System.out.println("����� �����");
			} else if (hour >= 4 && hour < 9) {
				System.out.println("����� ����");
			} else {
				System.out.println("����� ���");
			}
		}
	}
}
