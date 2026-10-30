package lbpProgram;

import java.util.Scanner;

public class LBP41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Order ID : ");
		int n = sc.nextInt();
		int otp =1;
		while(n !=0) {
			 otp = otp*(n%10);
			 n/=10;
		}
		System.out.println("OTP is : "+otp);
		sc.close();
	}

}
