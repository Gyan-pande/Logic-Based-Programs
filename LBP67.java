package lbpProgram;

import java.util.Scanner;

public class LBP67 {
	
	public static boolean hasIdentical(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String[] arr = sc.nextLine().split(" ");
		System.out.println(hasIdentical(arr[0]));
		sc.close();
	}
}
