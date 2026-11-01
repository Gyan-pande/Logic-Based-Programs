package lbpProgram;

import java.util.Scanner;

public class LBP66 {
	
	public static void repeatChar(String s) {
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			System.out.print(ch+""+ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		repeatChar(sc.nextLine());
		sc.close();
	}
}
