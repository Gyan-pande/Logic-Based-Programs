package lbpProgram;

import java.util.Scanner;

public class LBP61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a [a-h][1-8] : ");
		String s = sc.next();
		
		if(s.length()==2) {
			int x = s.charAt(0)-96;
			int y = s.charAt(1)-'0';
			if((y>=1 && y<=8) && (x >=1 && x<=8))
			{
				if((x+y)%2 !=0) {
					System.out.println("White");
				}
					else
						System.out.println("Black");
			}
			else
				System.err.println("Wrong Input");
		}
		else
			System.err.println("Wrong Input");
		sc.close();
	}
}
