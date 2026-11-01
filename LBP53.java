package lbpProgram;

import java.util.Scanner;

public class LBP53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int n = str.length();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] =sc.nextInt();
		
		char ch[] = new char[n];
		
		for(int i=0; i<n; i++) {
			ch[a[i]] = str.charAt(i);
			
		}
		System.out.println(new String(ch));
		sc.close();
	}
}
