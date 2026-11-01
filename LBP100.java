package lbpProgram;

import java.util.Scanner;

public class LBP100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sting : ");
		String str = sc.nextLine().toLowerCase();
		int a=0,l=0;
		if(!str.matches("[alp]+"))
			System.out.println("Invalid");
		else {
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c=='a') a++;
				else if(c=='l' && c++=='l') l++;
		}
			System.out.println((a<=1) && (l<=2)?"Yes":"No");
			}
		sc.close();
	}
}
