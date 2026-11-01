package lbpProgram;

import java.util.Scanner;

public class LBP98 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine().toLowerCase();
		if(str.matches("[0-9 ]+"))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}
