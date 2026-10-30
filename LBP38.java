package lbpProgram;

import java.util.Scanner;

public class LBP38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter in a NotePad : ");
		String str = sc.nextLine().toUpperCase();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >='A' && ch <='Z') || ch == ' ' || (ch>='0' && ch<='9')) continue;
			else
				count++;
		}
		System.out.println("Number of mistakes you done : "+count);
		sc.close();
	}
} 
