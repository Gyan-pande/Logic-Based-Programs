package lbpProgram;

import java.util.Scanner;

public class LBP8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt(); int temp = n;
		int sum=0;
		while(n !=0) {
			int dig = n%10;
			sum+=dig;
			n/=10;
		}
		System.out.println("sum of "+temp+" is "+sum);
		sc.close();
	}
}
