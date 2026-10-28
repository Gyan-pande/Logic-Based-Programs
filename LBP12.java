package lbpProgram;

import java.util.Scanner;

public class LBP12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numebr : ");
		int n = sc.nextInt();
		int sum=0;
		while(n !=0) {
			int dig = n%10;
			if( dig % 3==0) sum+=dig;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}
