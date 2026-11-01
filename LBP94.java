package lbpProgram;

import java.util.Scanner;

public class LBP94 {
	
	public static boolean isPangram(String str) {
		if(str.length() < 26 || str ==null)
			return false;
		if(!str.matches("[a-zA-Z ]+"))
			return false;
		int count=0;
		for(char c = 'a'; c<='z'; c++) {
			if(str.indexOf(c) !=-1)
				count++;
		}
		return count==26;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str =sc.nextLine();
		System.out.println(isPangram(str.toLowerCase())?"Yes":"No");
		sc.close();
	}
}
