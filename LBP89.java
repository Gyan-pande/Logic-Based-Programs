package lbpProgram;

import java.util.Scanner;

public class LBP89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s1  = sc.nextLine();
		System.out.print("Enter a string : ");
		String s2  = sc.nextLine();
		
		System.out.println((s1+s1).contains(s2));
		sc.close();
	}
}
