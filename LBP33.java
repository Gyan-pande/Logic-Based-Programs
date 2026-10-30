package lbpProgram;

import java.util.Scanner;

public class LBP33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your bill amount : ");
		int n = sc.nextInt();
		int sum=0;
		while(n !=0) {
			int d = n%10;
			if(d%2==0)
				sum+=d;
			n/=10;
		}
		
		System.out.println("You will get "+sum+"%");
		sc.close();
	}
}
