package lbpProgram;

import java.util.Scanner;

public class LBP75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine().toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
