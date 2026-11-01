package lbpProgram;

import java.util.Scanner;

public class LBP92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str =sc.nextLine();
		System.out.print("Enter any character : ");
		char ch = sc.next().charAt(0);
		int c=0;
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) == ch)
				System.out.print(++c);
			else
				System.out.print(str.charAt(i));
		
		
		
		sc.close();
	}
}
