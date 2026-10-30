package lbpProgram;

import java.util.Scanner;

public class LBP22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n= sc.nextInt();
		int sum=0, temp =n;
		
		while(n !=0) {
			sum +=(n%10);
			n/=10;
		}
		
		if(temp%sum == 0) 
			System.out.println("Niven Number");
		else
			System.out.println("Not a Niven Number");
		sc.close();
	}
}
