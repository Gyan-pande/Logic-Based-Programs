package lbpProgram;

import java.util.Scanner;

public class LBP60${
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s =sc.nextLine();
		int arr[] = new int[256];
		for(int i=0; i<s.length(); i++)
			arr[s.charAt(i)]++;
		
		int max=0;
		char ch =' ';
		
		for(int i=0; i<s.length(); i++) {
			if(max < arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				ch = s.charAt(i);
			}
		}
		
		System.out.println(max+"  "+ch);
		sc.close();
	}
}