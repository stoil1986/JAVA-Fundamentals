import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� ����:");
		float money = sc.nextFloat();
		System.out.println("�������� \"true\" �� ����� ��� \"false\" �� �����:");
		Boolean isHealthy = sc.nextBoolean();
		if (!isHealthy) {
			if (money > 10) {
				System.out.println("�� �� ���� ���������");
			} else {
				System.out.println("�� ��� ���");
			}
		}else {
			if (money > 10) {
				System.out.println("�� ����� �� ���� � �������");
			} else {
				System.out.println("�� ������ �� �� �������");
			}
		}
	}

}

// else {
// System.out.println("���� �� �������");
// }
// if (money > 0) {
// System.out.println("�� �� ���� ���������");
// if (money < 10) {
// System.out.println("�� ����� �� ����");
// }
// }else {
// System.out.println("�� ���� ����� � �� ��� ���");
// }