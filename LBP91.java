package lbpProgram;

import java.util.Scanner;

public class LBP91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)-96);
		}
		sc.close();
	}
}
