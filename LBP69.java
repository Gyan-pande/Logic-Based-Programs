package lbpProgram;

import java.util.Scanner;

public class LBP69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		System.out.println();
		
		System.out.println(sc.nextLine().replaceAll("[aeiou]", ""));
		
//		String s = sc.nextLine().toLowerCase();
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//				continue;
//			else
//				System.out.print(ch);
			sc.close();
//		}
	}
}
