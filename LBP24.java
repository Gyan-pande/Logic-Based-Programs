package lbpProgram;

import java.util.Scanner;

public class LBP24 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a second number : ");
		int n2 = sc.nextInt();
		
		int sum =0;
		
		for(int i=n1; i<=n2; i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum of Even number is : "+sum);
		sc.close();
		
	}
}
