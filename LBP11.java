package lbpProgram;

import java.util.Scanner;

public class LBP11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numuber : ");
		int n = sc.nextInt();
		int sum=0;
		while(n !=0) {
			int dig = n%10;
			if(dig == 2 || dig == 3 || dig == 5 || dig == 7 || dig == 9)
				sum+=dig;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}
