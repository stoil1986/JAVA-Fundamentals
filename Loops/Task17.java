import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете страна на квадрата в граници [3..20]");
		int b = sc.nextInt();
		System.out.println("Въведете желан знак");
	//	char c = sc.next().charAt(0);
		String c = sc.next();
		if (b < 3 || b > 20) {
			System.out.println("Въведената страна е извън тези граници");
		} else {
			for (int i = 0; i < b; i++) {
				System.out.print("*");
			}
			System.out.println();
			for (int row = 1; row <= b-2; row++) {
				System.out.print("*");
				
				for (int i = 1; i <= b-2; i++) {					 
					System.out.print(c);					 					
				}
				System.out.print("*\n");
			}
			for (int i = 0; i < b; i++) {
				System.out.print("*");
			}	
			
//			-----Решение 2-----
			
//	 		System.out.println(repeatStr("*",b));
//			for (int i = 0; i < b-2; i++) {
//				System.out.print("*");
//				System.out.print(repeatStr(c,b-2));
//				System.out.print("*\n");
//			}
//			System.out.println(repeatStr("*",b));
		}
	}
	public static String repeatStr(String str, int count) {
		 StringBuilder repeated = new StringBuilder();
		 for (int i = 0; i < count; i++) {
		 repeated.append(str);
		 }
		 return repeated.toString();
		 }
}
