package lbpProgram;

import java.util.Scanner;

public class LBP63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine().toLowerCase();
		int c=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				c++;
		}
		System.out.println("No of Vowels : "+c);
		sc.close();
	}
}
