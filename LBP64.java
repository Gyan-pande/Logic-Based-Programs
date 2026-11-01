package lbpProgram;

import java.util.Scanner;

public class LBP64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine().toLowerCase();
		int cx=0,co=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='x')
				cx++;
			else if(s.charAt(i)=='o')
				co++;
		}
		
		if(cx==co)
			System.out.println(true);
		else if(cx==0 && co == 0)
			System.out.println(true);
		else
			System.out.println(false);
		sc.close();
	}
}
