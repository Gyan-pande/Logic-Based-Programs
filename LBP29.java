package lbpProgram;

import java.util.Scanner;

public class LBP29 {
	
	public static int isPrime(int n) {
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(isPrime(n) == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		sc.close();
	}
}
