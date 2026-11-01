package lbpProgram;

import java.util.Scanner;

public class LBP82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Emter a string : ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='z' || ch=='Z')
				System.out.print((char)(ch-25));
			else
				System.out.print(++ch);
		}
		sc.close();
	}
}
