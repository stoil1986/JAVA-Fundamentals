
public class Task10 {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 3, 3, 4, 4, 6, 3, 2, 7, 2 };
		int counter;
		int maxCounter = 0;
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			counter = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
				}
			}
			if (counter > maxCounter) {
				maxCounter = counter;
				element = arr[i];
			}
		}
		System.out.println(element + " --> " + maxCounter + " times");
	}
}
