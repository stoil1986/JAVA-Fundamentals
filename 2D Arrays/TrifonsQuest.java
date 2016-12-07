import java.util.Scanner;

public class TrifonsQuest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int health = sc.nextInt();
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		char[][] map = new char[rows][cols];
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				map[row][col] = sc.next().charAt(0);
			}
		}
		int turnCount = 0;
		char action = ' ';
		boolean isNotDied = true;

		for (int col = 0; col < map[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < map.length; row++) {
					action = map[row][col];
					
					if (action == 'F') {
						health -= turnCount/2;
						if (health <= 0) {
							System.out.printf("Died at: [%d][%d]",row ,col);
							System.out.println();
							isNotDied = false;
							break;						
						}
					}else if (action == 'H') {
						health += turnCount/3;
					}else if (action == 'T') {
						turnCount += 2;
					}
					turnCount++;					
				}
			}else {
				for (int row = map.length - 1; row >= 0; row--) {
					action = map[row][col];
					if (action == 'F') {
						health -= turnCount/2;
						if (health <= 0) {
							System.out.printf("Died at: [%d][%d]",row ,col);
							System.out.println();
							isNotDied = false;
							break;
						}
					}else if (action == 'H') {
						health += turnCount/3;
					}else if (action == 'T') {
						turnCount += 2;
					}
					turnCount++;
				}
			}
		}
		if (isNotDied) {
			System.out.println("Quest complete");
			System.out.println("Health: " + health);
			System.out.println("Turns: " + turnCount);
		}		 		
	}	
}

//        Tests 


//   50              8 
//   4 5             4 3
//   T T F F F       H H F
//   E H H F F       F H H
//   T H T F F       E F T
//   E H T T T       H H T







