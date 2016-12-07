//// SINGLE PLAYER (с много прост бот)

import java.util.Random;
import java.util.Scanner;

public class MorskiShah { 

	public static void main(String[] args) {
		
		char[][] map = {
			    {' ','|',' ','|',' '},			
				{'-','-','-','-','-'},			
				{' ','|',' ','|',' '}, 
				{'-','-','-','-','-'},
				{' ','|',' ','|',' '},
			};
		Scanner sc = new Scanner(System.in);
		System.out.println("Здравейте скъпи приятели");
		System.out.println("Това е нашата игра");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("Може да избирате между \"Х\" и \"О\"");
		char player1 = sc.nextLine().charAt(0);
		while (player1 != 'X' && player1 != 'O') {
			System.out.println("Въведи \"X\"  или \"O\" бе ИГРАЧ !!!");
		    player1 = sc.nextLine().charAt(0);
		}
		char player2 = player1 == 'X' ? 'O' : 'X';

		int counter = 0;   //брои броя въвеждания на player1 
		boolean end = false;
		while (true) {
			counter++;
			System.out.println("Избери координати между 1 и 3");
			int row = sc.nextInt();
			int col = sc.nextInt();
			int realRow = row;
			int realCol = col;
			while (!(row >= 1 && row <= 3)) {
				System.out.println("Абе аз на кой говоря, казах между 1 и 3");
			    row = sc.nextInt();
			}			
			if (row == 1) {
				realRow = 0;
			}
			if (row == 3) {
				realRow = 4;
			}		    
			while (col < 1 || col > 3) {
				System.out.println("Абе аз на кой говоря, казах между 1 и 3");
			    col = sc.nextInt();
			}
			if (col == 1) {
				realCol = 0;
			}
			if (col == 3) {
				realCol = 4;
			}
			if (map[realRow][realCol] != ' ') {
				System.out.println("Полето е вече заето, избери друго");
				continue;
			}
			System.out.println("Координатите са приети\n");
			map[realRow][realCol] = player1;
					
			if (counter == 5) {				
				end = false;
			}else {				
				int enemyRealRow;
				int enemyRealCol;
				if (map[2][2] == ' ') {
					enemyRealRow = 2;
					enemyRealCol = 2;
				}else {
					Random r = new Random();				 			
					while(true){
						enemyRealRow = r.nextInt(3)*2;//0, 2 or 4
						enemyRealCol = r.nextInt(3)*2;//0, 2 or 4
						if(map[enemyRealRow][enemyRealCol] == ' '){
						break;
						}
					}
				}
				map[enemyRealRow][enemyRealCol] = player2;
			}											 			
//Check for victory 
								
			
			for (int i = 0; i < map.length; i++) {				
				if ((map[i][0] == player1 && map[i][0] == map[i][2] && map[i][2] == map[i][4])
						||(map[0][i] == player1 && map[0][i] == map[2][i] && map[2][i] == map[4][i])){  
					System.out.println("Бати късметлията, YOU WIN\n"); 
					end = true;
					break;						 						 				     		 					 
				}else if ((map[i][0] == player2 && map[i][0] == map[i][2] && map[i][2] == map[i][4])
						||(map[0][i] == player2 && map[0][i] == map[2][i] && map[2][i] == map[4][i])){ 
					System.out.println("LOOSER, Тъпия бот те победи\n"); 
					end = true;
					break; 				 	
				}													 
			}
			
			if ((map[0][0] == player1 && map[0][0] == map[2][2] && map[2][2] == map[4][4])
					||(map[4][0] == player1 && map[4][0] == map[2][2] && map[2][2] == map[0][4])){  
				System.out.println("Бати късметлията, YOU WIN\n"); 				
				end = true;
			}else if((map[0][0] == player2 && map[0][0] == map[2][2] && map[2][2] == map[4][4])
					||(map[4][0] == player2 && map[4][0] == map[2][2] && map[2][2] == map[0][4])){
				System.out.println("LOOSER, Тъпия бот те победи\n"); 				
				end = true;
			}
// Print the map
			for(int i = 0; i < map.length; i++){
				for(int j = 0; j < map[i].length; j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			if (end) {
				break;
			}
			if (counter == 5) {				
				System.out.println("РАВЕН, що не пробваш пак\n");
				break;
			}
		}		 				 		 					
	}
}


//// MULTIPLAYER
// 
//import java.util.Random;
//import java.util.Scanner;
//
//public class MorskiShah {
//
//	public static void main(String[] args) {
//		
//		char[][] map = {
//			    {' ','|',' ','|',' '},			
//				{'-','-','-','-','-'},			
//				{' ','|',' ','|',' '},
//				{'-','-','-','-','-'},
//				{' ','|',' ','|',' '},
//			};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Здравейте скъпи приятели");
//		System.out.println("Това е нашата игра");
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[0].length; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("Може да избирате между \"Х\" и \"О\"");
//		char player1 = sc.nextLine().charAt(0);
//		while (player1 != 'X' && player1 != 'O') {
//			System.out.println("Въведи \"X\"  или \"O\" бе ИГРАЧ !!!");
//		    player1 = sc.nextLine().charAt(0);
//		}
//		char player2 = player1 == 'X' ? 'O' : 'X';
//
//		int counter = 0;   //брои броя въвеждания на player1 
//		boolean end = false;
//		while (true) {		
//			System.out.println("Player1 --> Избери координати между 1 и 3");
//			int row = sc.nextInt();
//			int col = sc.nextInt();
//			int realRow = row;
//			int realCol = col;
//			counter++;
//			while (row < 1 || row > 3) {
//				System.out.println("Абе аз на кой говоря, казах между 1 и 3");
//			    row = sc.nextInt();
//			}			
//			if (row == 1) {
//				realRow = 0;
//			}
//			if (row == 3) {
//				realRow = 4;
//			}		    
//			while (col < 1 || col > 3) {
//				System.out.println("Абе аз на кой говоря, казах между 1 и 3");
//			    col = sc.nextInt();
//			}
//			if (col == 1) {
//				realCol = 0;
//			}
//			if (col == 3) {
//				realCol = 4;
//			}
//			if (map[realRow][realCol] != ' ') {
//				System.out.println("Полето е вече заето, избери друго");				
//				continue;
//			}
//			System.out.println("Координатите са приети\n");
//			map[realRow][realCol] = player1;
//			
//			for(int i = 0; i < map.length; i++){
//				for(int j = 0; j < map[i].length; j++){
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//			
//			for (int i = 0; i < map.length; i++) {				
//				if ((map[i][0] == player1 && map[i][0] == map[i][2] && map[i][2] == map[i][4])
//						||(map[0][i] == player1 && map[0][i] == map[2][i] && map[2][i] == map[4][i])){  
//					System.out.println("Бати късметлията, Player1 WINS\n");  
//					end = true;
//					break;						 						 				     		 					 
//				}													 
//			}
//			if ((map[0][0] == player1 && map[0][0] == map[2][2] && map[2][2] == map[4][4])
//					||(map[4][0] == player1 && map[4][0] == map[2][2] && map[2][2] == map[0][4])){  
//				System.out.println("Бати късметлията, Player1 WINS\n"); 				
//				end = true;
//			}
//			if (end) {
//				break;
//			}
//					
//			if (counter == 5) {				
//				end = false;
//			}else {
//				System.out.println("Player2 --> Избери координати между 1 и 3");
//				int row1 = sc.nextInt();
//				int col1 = sc.nextInt();
//				int enemyRealRow = row1;
//				int enemyRealCol = col1;
//				while (row1 < 1 || row1 > 3) {
//					System.out.println("Абе аз на кой говоря, казах между 1 и 3");
//				    row1 = sc.nextInt();
//				}			
//				if (row1 == 1) {
//					enemyRealRow = 0;
//				}
//				if (row1 == 3) {
//					enemyRealRow = 4;
//				}		    
//				while (col1 < 1 || col1 > 3) {
//					System.out.println("Абе аз на кой говоря, казах между 1 и 3");
//				    col1 = sc.nextInt();
//				}
//				if (col1 == 1) {
//					enemyRealCol = 0;
//				}
//				if (col1 == 3) {
//					enemyRealCol = 4;
//				}
//				if (map[enemyRealRow][enemyRealCol] != ' ') {
//					System.out.println("Полето е вече заето, избери друго");					
//					continue;
//				}				 
//				System.out.println("Координатите са приети\n");
//				 
//				map[enemyRealRow][enemyRealCol] = player2;
//			}											 			
////Check for victory 
//								
//			
//			for (int i = 0; i < map.length; i++) {				
//				 if ((map[i][0] == player2 && map[i][0] == map[i][2] && map[i][2] == map[i][4])
//						||(map[0][i] == player2 && map[0][i] == map[2][i] && map[2][i] == map[4][i])){ 
//					System.out.println("Бати късметлията, Player2 WINS\n"); 
//					end = true;
//					break; 				 	
//				}													 
//			}
//						 
//			if((map[0][0] == player2 && map[0][0] == map[2][2] && map[2][2] == map[4][4])
//					||(map[4][0] == player2 && map[4][0] == map[2][2] && map[2][2] == map[0][4])){
//				System.out.println("Бати късметлията, Player2 WINS\n"); 				
//				end = true;
//			}
//// Print the map
//			for(int i = 0; i < map.length; i++){
//				for(int j = 0; j < map[i].length; j++){
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//			if (end) {
//				break;
//			}
//			if (counter == 5) {				
//				System.out.println("РАВЕН, що не пробвате пак\n");
//				break;
//			}
//		}		 				 		 					
//	}
//}	



