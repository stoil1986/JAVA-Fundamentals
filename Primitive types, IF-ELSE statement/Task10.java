import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �� ����������:");
		int tankCapacity = sc.nextInt();
		if (tankCapacity < 10 || tankCapacity > 9999) {
			System.out.println("���������� ���� �� ���������� � ����� ��������� [10..9999]!");
		} else {
			int timesToFill = tankCapacity / (2 + 3);
			int litersToAdd = (tankCapacity % 5);
			if (litersToAdd == 1) {
				timesToFill--;
			}
			System.out.println(timesToFill + " ���� x 2 �����");
			System.out.println(timesToFill + " ���� x 3 �����");
			if (litersToAdd == 1) {								
				System.out.println("2 ������������ ���� �� 3 �����");
			} else if (litersToAdd == 2) {
				System.out.println("������������ ���� �� 2 �����");
			} else if (litersToAdd == 3) {
				System.out.println("������������ ���� �� 3 �����");
			} else if (litersToAdd == 4) {
				System.out.println("2 ������������ ���� �� 2 �����");
			}
			 			
		}		
	}
}
