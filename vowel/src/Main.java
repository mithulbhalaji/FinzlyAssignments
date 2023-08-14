import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the word : ");
		String word = sc.nextLine();
		word = word.toLowerCase();
		
		VowCheck vcb = new VowCheck();
		
		System.out.println("\n"+vcb.checkInBuilt(word));
		System.out.println("\n"+vcb.checkWithoutInBuilt(word));

		
	}
	
}
