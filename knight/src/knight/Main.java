package knight;

import java.util.Scanner;

public class Main {
	
		public static char[][] chessBoard = new char[8][8];
		public static int[] inputRC = new int[2];
		public static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {			
			fillBoard();
			showBoard();
			input();
			chessBoard[inputRC[0]][inputRC[1]] = 'K';
			showBoard();
			possibilities(inputRC[0],inputRC[1]);
			
			char c;
			
			boolean b = true;
			while(b) {
					chessBoard[inputRC[0]][inputRC[1]] = 'K';
					System.out.println("Whether you want to continue ? For yes Y : no N ");
					c = sc.next().charAt(0);
					if(c=='Y') {
						int tempRow = inputRC[0];
						int tempColumn = inputRC[1];
						remove(tempRow,tempColumn);
						input();
						System.out.println(inputRC[0]+ " "+inputRC[1]);
						boolean check = true;
						while(check) {
							if(! (isPossible(inputRC[0],inputRC[1],tempRow,tempColumn))) {
								System.out.println("The knight can't move there");
								input();	
							}else {
								check = false;
							}
						}
						
						chessBoard[inputRC[0]][inputRC[1]] = 'K';
						showBoard();
						possibilities(inputRC[0],inputRC[1]);	
						
						
						
					}else if(c=='N') {
						b = false;
					}else {
						b = false;
					}
			}	
		}
		
		public static void showBoard() {
			System.out.println("Chess Board : ");
			System.out.println("________________________");
			
			for(int i = 0;i<8;i++) {
					System.out.print("|");
				for(int j = 0;j<8;j++) {
					System.out.print(chessBoard[i][j]+" |");
				}
				System.out.println();
				System.out.println("________________________");
			}
		}
		public static void fillBoard() {
			
			for(int i = 0;i<8;i++) {
				for(int j = 0;j<8;j++) {
					chessBoard[i][j]= ' ';
				}
			}
			System.out.println("Board filled");
		}
		
		public static boolean isValid(int row, int column) {
			if(row >= 0 && row<8 && column>=0 && column <8 ) {
				return true;
			}
			return false;
		}
		//cR = current Row , pR = previous Row
		public static boolean isPossible(int cR, int cC, int pR, int pC ) {
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			if(pR-cR == -2 && pC-cC == -1) {
				return true;
			}
			return false;
		}
		public static void possibilities(int row, int column) {
			System.out.println(row + " "+column);
			int count = 0;
			if(isValid(row -2,column-1)) {
				System.out.println("Row : "+ (row-2) +" Column : "+(column-1));
				count++;
				
			}
			if(isValid(row -1,column-2)) {
				System.out.println("Row : "+(row-1)+" Column : "+(column-2));
				count++;
			}
			if(isValid(row +2,column-1)) {
				System.out.println("Row : "+(row+2)+" Column : "+(column-1));
				count++;
			}
			if(isValid(row +1,column-2)) {
				System.out.println("Row : "+(row+1)+" Column : "+(column-2));
				count++;
			}
			if(isValid(row -2,column+1)) {
				System.out.println("Row : "+(row-2)+" Column : "+(column+1));
				count++;
			}
			if(isValid(row -1,column+2)) {
				System.out.println("Row : "+(row-1)+" Column : "+(column+2));
				count++;
			}
			if(isValid(row +2,column+1)) {
				System.out.println("Row : "+(row+2)+" Column : "+(column+1));
				count++;
			}
			if(isValid(row +1,column+2)) {
				System.out.println("Row : "+(row+1)+" Column : "+(column+2));
				count++;
			}
			System.out.println("Possible Counts : "+ count);
			System.out.println(row+" "+column);
		
		}
		public static void input() {
			System.out.println("Enter your row : ");
			inputRC[0] = sc.nextInt();
			System.out.println("Enter your column : ");
			inputRC[1] = sc.nextInt();
			if(! (inputRC[0] >= 0 && inputRC[0]<8 && inputRC[1]>=0 && inputRC[1] <8)) {
				System.out.println("Please enter a valid move");
				input();
			}
		}
		public static void remove(int row, int column) {
			chessBoard[row][column] = ' ';
		}
}
