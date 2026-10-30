package lbpProgram;

import java.util.Scanner;

public class LBP49 {
	
	
	public static boolean nextPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Prime Number : ");
		int n = sc.nextInt();
		int temp = n;

		while(true) {
			if(nextPrime(n)) {
				if(n!=temp) {
					System.out.println(n);
					break;
				}
			}
			n++;
		}
		
		sc.close();
	}

}
