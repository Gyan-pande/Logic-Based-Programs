package lbpProgram;

import java.util.Scanner;

public class LBP54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentences : ");
		String[] str = sc.nextLine().split(" ");
		System.out.println(str.length);
		
		sc.close();
	}
}
