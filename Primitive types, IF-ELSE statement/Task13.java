import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����������� � ������ ������ � ��������[-100..100]:");
		int t = sc.nextInt();
		if (t < -100 || t > 100) {
			System.out.println("���������� ������������ � ����� ���� ��������!");
		} else {
			if (t < -20) {
				System.out.println("������ �������");
			} else if (t >= -20 && t < 0) {
				System.out.println("�������сто");
			} else if (t >= 0 && t <= 15) {
				System.out.println("������");
			} else if (t > 15 && t <= 25) {
				System.out.println("�����");
			} else {
				System.out.println("������");
			}
		}
	}
}
