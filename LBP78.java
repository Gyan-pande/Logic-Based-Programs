package lbpProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LBP78 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter a String : ");
//		String str = sc.nextLine();
//		String revDup="";
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			if(revDup.indexOf(ch) == -1)
//				revDup +=ch;
//		}
//		System.out.println(revDup);
//		sc.close();
		
		
		
	
		char[] dup = sc.nextLine().toLowerCase().toCharArray();
		Set<Character> revDup = new LinkedHashSet<Character>();
		
		for(char ch : dup)
			revDup.add(ch);
		
		for(char ch : revDup)
			System.out.print(ch);
		sc.close();
	}
}
