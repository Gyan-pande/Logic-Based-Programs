package lbpProgram;

import java.util.Scanner;

public class LBP87 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		char[] str =sc.nextLine().toCharArray();
		int c=0;
		for(char ch : str) {
			if(ch =='(') c++;
			if(ch == ')') c--;
		}
		System.out.println(c);
		sc.close();
	}
}
