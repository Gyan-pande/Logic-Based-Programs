package lbpProgram;

import java.util.Scanner;

public class LBP90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine().toLowerCase();
				
		for(int i=97; i<=122; i++) {
			if(str.indexOf(i) == -1)
				System.out.print((char)i+" ");
		}
		sc.close();
		
		
	}
}
