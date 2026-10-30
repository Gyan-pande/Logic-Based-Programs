package lbpProgram;

import java.util.Scanner;

public class LBP42 {

	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i ==0)
				count++;
		}
		return (count==2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 = sc.nextInt();
		int sum=0;
		for(int i=n1; i<=n2; i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
