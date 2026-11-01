package lbpProgram;

import java.util.Scanner;

public class LBP70 {
	
	public static void space(String s) {
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ')
				continue;
			else
				System.out.print(s.charAt(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		space(sc.nextLine());
		sc.close();
	}
}
