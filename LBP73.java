package lbpProgram;

import java.util.Scanner;

public class LBP73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Zipe code : ");
		int zipe = sc.nextInt();
		String s = Integer.toString(zipe);
		System.out.println((s.length()==5)?true:false);
		sc.close();
		
	}
}
