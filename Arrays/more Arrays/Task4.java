
public class Task4 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,1,1,0,1,0};
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				counter++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < counter) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
