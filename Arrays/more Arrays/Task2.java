
public class Task2 {

	public static void main(String[] args) {
		
		int[] arr = {3,8,4,6,2,7,1};
		boolean jagged = true;
		for (int i = 1; i < arr.length-1; i++) {
			if (!((arr[i-1] > arr[i] && arr[i] < arr[i+1]) || 
				(arr[i-1] < arr[i] && arr[i] > arr[i+1]))){
				jagged = false;
				break;
			}
		}
		if (jagged) {
			if (arr[0] < arr[1]) {
				System.out.println("Назъбен нагоре");
			}else {
				System.out.println("Назъбен надолу");
			}
		}else {
			System.out.println("Не е назъбен");
		}
	}
}
