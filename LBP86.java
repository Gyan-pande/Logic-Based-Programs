package lbpProgram;

import java.util.Scanner;

public class LBP86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str =sc.nextLine();
		System.out.print("Enter a Vowels : ");
		String vowel = sc.nextLine();
		for(int i=0; i<vowel.length(); i++) {
			str = str.replaceFirst("\\*", String.valueOf(vowel.charAt(i)));
		}
		System.out.println(str);
		
		
		
		
//		int num=0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) =='*')
//				System.out.print(vowel.charAt(num++));
//			else
//				System.out.print(str.charAt(i));
//		}
		sc.close();
	}
	
}
