package lbpProgram;

import java.util.Scanner;

public class LBP40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
//		System.out.println(new StringBuffer(sc.nextLine()).reverse());
		int n = sc.nextInt();
		int rev=0;
		while(n !=0) {
			rev = rev*10+n%10;
			n/=10;
		}
		System.out.println(rev);
		
		
		
		sc.close(); 
	}
}
