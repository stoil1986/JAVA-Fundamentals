
public class Task4 {

	public static void main(String[] args) {

		print(1, 9);
	}

	static void print(int start, int end) {

		for (int i = 1; i <= start; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		if (start >= end) {
			return;
		} else {
			print(start + 1, end);
		}
	}
}
