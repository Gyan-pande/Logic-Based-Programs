package lbpProgram;

import java.util.Scanner;

public class LBP83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s =sc.nextLine();
		System.out.print("Enter vowel number : ");
		int v = sc.nextInt();
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
				if(count ==v)
					System.out.print(s.charAt(i));
			}
		}
		sc.close();
	}
}
