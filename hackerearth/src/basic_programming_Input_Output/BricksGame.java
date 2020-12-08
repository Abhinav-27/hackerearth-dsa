package basic_programming_Input_Output;

import java.util.Scanner;

public class BricksGame {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();

		int i=1;
		while(N>0) {
			N = N-i;
			if(N<=0) {
				System.out.println("Patlu");
				break;
			}
			N = N-(2*i);
			if(N<=0) {
				System.out.println("Motu");
				break;
			}
			i++;
		}
		
	}
}
