package lbpProgram;

import java.util.Scanner;

public class LBP93 {
	
	public static Character isRepeat(String str) {
		char [] repeat = new char[255];
		for(char c : str.toCharArray())
			repeat[c]++;
		
		for(char c : str.toCharArray()) {
			if(repeat[c] == 1)
				return c;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		System.out.println(isRepeat(sc.nextLine()));
		sc.close();
	}
}

