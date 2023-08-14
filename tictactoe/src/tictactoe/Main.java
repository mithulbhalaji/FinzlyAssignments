package tictactoe;
import java.util.Scanner;
public class Main {
	
	public static char[][] skel = new char[3][3];
	public static int a = 0;
	public static Scanner sc = new Scanner(System.in);
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	
	
	public static void main(String[] args) {
		int row;
		int column;
		char player;
		boolean check = false;
		while(!check) {
			
			//Displaying board
			showSkel();
			
			//Choosing player
			player = a%2==0? 'X':'O';
			
			//Row Input
			System.out.println("Enter the row : ");
			row = sc.nextInt();
			row-=1;
			
			//Column Input
			System.out.println("Enter the column : ");
			column = sc.nextInt();
			column-=1;
			
			//To fill the board based on user input
			fill(row,column,player);
			check = checkEnd(player);
			if(check) {
				showSkel();
				System.out.println(player + " won");
			}
		}
	}
	
	
//For user input in the board
	private static void fill(int row, int column, char player) {
		char c = skel[row][column];
		if(c == '\0') {
			skel[row][column] = player;
			a++;
		}else {
			System.out.println(ANSI_RED + "Already Occupied" + ANSI_RESET);
		}
	}
	
	
//For displaying the board
	private static void showSkel() {
		
		for(int i = 0;i<3;i++) {
			System.out.println(" _ _ _");
			System.out.print("|");
			for(int j = 0;j<3;j++) {
				if(skel[i][j]=='\0') {
					System.out.print( skel[i][j]+" |");
				}else {
				System.out.print( skel[i][j]+"|");}
			}
			System.out.println();
			System.out.println(" - - -");
		}
	}
	
//Logic check
	private static boolean checkEnd(int player) {
		boolean b = false;
	
		if(skel[0][0]== player && skel[1][1] == player &&  skel[2][2]==player) {
			return true;
		}
		if(skel[0][2]== player && skel[1][1] == player &&  skel[2][0]==player) {
			return true;
		}
		
		for(int i = 0;i<skel.length;i++) {
			if(skel[i][0]== player && skel[i][1]== player&& skel[i][2] == player) {
				return true;
			}
		}
		for(int i = 0;i<skel.length;i++) {
			if(skel[0][i] == player && skel[1][i]== player && skel[2][i]== player) {
				return true;
			}
		}		
		return b;
	}
	
}
