import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
						
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {			
			arr[i] = i*3;
		}
		System.out.println("Елементите са:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} 
	}
}
