package lbpProgram;

import java.util.Scanner;

public class LBP37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print((char)(ch+32));
			else if(Character.isLowerCase(ch))
				System.out.print((char)(ch-32));
			else System.out.print(ch);
		}
		sc.close();
	}
}
