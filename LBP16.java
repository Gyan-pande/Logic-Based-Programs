package lbpProgram;

import java.util.Scanner;

public class LBP16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.print("Enter a digit : ");
		int d = sc.nextInt();
		int count=0;
		while(n !=0) {
			int dig = n%10;
			if(dig==d)
				count++;
			n/=10;
		}
		System.out.println(count);
		sc.close();
	}
}
