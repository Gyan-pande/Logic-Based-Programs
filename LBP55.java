package lbpProgram;

import java.util.Scanner;

public class LBP55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String :");
		String s1 = sc.nextLine();
		System.out.print("Enter sencod String :");
		String s2 = sc.nextLine();
		
		System.out.println(s1.endsWith(s2));
		sc.close();
	}
}
