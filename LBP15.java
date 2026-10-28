package lbpProgram;

import java.util.Scanner;

public class LBP15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String str = sc.nextLine();
		System.out.println(check(str));
		sc.close();
	}
	
	public static boolean check(String str) {
		if(str.charAt(0)=='0') {
			System.out.println("Ocatal number");
			return false;
		}
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == '0')
				return true;
		}
		return false;
	}

}
