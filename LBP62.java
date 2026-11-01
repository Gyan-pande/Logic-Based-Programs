package lbpProgram;

import java.util.Scanner;

public class LBP62 {
	public static String isBomb(String s) {
		if(s.contains("bomb"))
		return "Duck!";
		else
			return "There is no bomb here!";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine().toLowerCase();
		System.out.println(isBomb(s));
		sc.close();
	}
}
