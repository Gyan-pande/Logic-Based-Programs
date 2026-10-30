package lbpProgram;

import java.util.Scanner;

public class LBP50 {
	static int sum;
	public static void sumOfDigit(int n) {
		while(n !=0) {
			sum+=(n%10);
			n/=10;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Second number : ");
		int n2 = sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			sumOfDigit(i);
		}
		
		System.out.println(sum);
		sc.close();
		
	}
}
