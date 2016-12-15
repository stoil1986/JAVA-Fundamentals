import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

	static int fib(int n) {
		if (n <= 2) {
		    return 1;
		}
		return fib(n-1) + fib(n-2);
	}

}
