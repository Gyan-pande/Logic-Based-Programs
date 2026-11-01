package lbpProgram;

import java.util.Scanner;

public class LBP96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine().toLowerCase();
		int count=0;
		for(char c : str.toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
