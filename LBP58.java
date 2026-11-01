package lbpProgram;

import java.util.Scanner;

public class LBP58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String s1 =sc.nextLine();
		System.out.print("Enter second string : ");
		String s2 =sc.nextLine();
		System.out.println((s1.substring(0,1).toUpperCase()+s1.substring(1)+s2));
		sc.close();
	}
}
