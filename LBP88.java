package lbpProgram;

import java.util.Scanner;

public class LBP88 {
	
	public static boolean qwertyuiop(String str) {
		String k1 = "qwertyuiop";
		for(int i=0; i<str.length(); i++) {
			if(k1.indexOf(str.charAt(i)) == -1)
				return false;
		}
		return true;
		
	}
	
	public static boolean asdfghjkl(String str) {
		String k2 = "asdfghjkl";
		for(int i=0; i<str.length(); i++) {
			if(k2.indexOf(str.charAt(i)) == -1)
				return false;
		}
		return true;
	}
	
	public static boolean zxcvbnm(String str) {
		String k1 = "qwertyuiop";
		for(int i=0; i<str.length(); i++) {
			if(k1.indexOf(str.charAt(i)) == -1)
				return false;
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println(qwertyuiop(str) || asdfghjkl(str) || zxcvbnm(str));
		sc.close();
	}
}
