package lbpProgram;

import java.util.Scanner;

public class LBP35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum=0;
		while(n !=0) {
			int d = n%10;
			if(d==4 || d==6 || d==8 || d==9)
				sum+=d;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}
