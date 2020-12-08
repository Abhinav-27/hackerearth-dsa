package basic_programming_Input_Output;

import java.util.Scanner;

public class Zoos {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		String str = sc.next();
		
		long n1 = str.chars().filter(num -> num == 'o').count();
		long n2 = str.chars().filter(num -> num == 'z').count();
		if(n1==(n2*2))
			System.out.println("Yes");
		else System.out.println("No");

	}

}
