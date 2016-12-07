import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете брой елементи на масивa");
		int length = sc.nextInt();
		System.out.println("Въведете елементите на масива");

		double[] arr = new double[length];
		double[] resultArr = new double[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			if (arr[i] < -0.231) {
				resultArr[i] = (i + 1) * (i + 1) + 41.25;
			} else {
				resultArr[i] = arr[i] * (i + 1);
			} 
			System.out.print(arr[i] + " ");			
		}	
		System.out.print("\nНовият масив е: ");
		for (int i = 0; i < resultArr.length; i++) {
			System.out.printf("%.2f ",resultArr[i]);
		}		
	}
}
//-1,12 -2,43 3,1 4,2 0 6,4 -7,5 8,6 9,1 -4
