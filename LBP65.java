package lbpProgram;

import java.util.Scanner;

public class LBP65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		
		System.out.println(s.substring(0,2)+" ... "+s.substring(0, 2)+" ... "+s+"?");
		sc.close();
	}
}
