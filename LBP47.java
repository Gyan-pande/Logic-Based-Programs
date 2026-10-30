package lbpProgram;

import java.util.Scanner;

public class LBP47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numer : ");
		int n =sc.nextInt();
		int sum=0;
		while(n !=0) {
			sum+=(n%10);
			n/=10;
		}
		System.out.println((sum%2==0)?"Evenish":"Oddish");
		sc.close();
	}

}
