package lbpProgram;

import java.util.Scanner;

public class LBP17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp =n,rev=0;
		while(n !=0) {
			int dig = n%10;
			rev = rev*10+dig;
			n/=10;
		}
		System.out.println((temp == rev)?"true":"false");
		sc.close();
	}
}
