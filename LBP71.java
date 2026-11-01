package lbpProgram;

import java.util.Scanner;

public class LBP71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine().toLowerCase();
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		
//		System.out.println(s.replaceAll("[aeiou]", ch+""));
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' ||c =='u')
				System.out.print(ch);
			else
				System.out.print(c);
		}
		sc.close();
	}
}
