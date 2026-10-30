package lbpProgram;

import java.util.Scanner;

public class LBP43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your bill Amount : ");
		int n = sc.nextInt();
		int odd=0, even =0;
		while(n !=0) {
			int d=n%10;
			if(d%2==0)
				even+=d;
			else
				odd+=d;
			n/=10;
		}
		
		System.out.println("Discount is "+(even*odd)+"%");
		sc.close(); 
	}
}
