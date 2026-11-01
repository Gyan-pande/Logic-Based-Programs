package lbpProgram;

import java.util.Scanner;

public class LBP74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		if(s.length()%2==0)
			System.out.println(s.charAt((s.length()/2)-1));
		else
			System.out.println(s.charAt((s.length()/2)));
		sc.close();
		
	}
}
