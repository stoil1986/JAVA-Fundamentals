import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		if (checkForPrime(n,2)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}			 
	}
	static boolean checkForPrime(int n, int div) {
		if (n % div == 0)  {
			return false;
		}
	    if (div == n-1) {
	    	return true;
	    }
	    return checkForPrime(n, div + 1);
	
	}

}
