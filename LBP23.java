package lbpProgram;

import java.util.Scanner;

public class LBP23 {
	
	public static int checkNumber(int n) {
		int count=0;
		while(n !=0) {
			n/=10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a two digit number : ");
		int n = sc.nextInt();
		
		if(checkNumber(n) ==2) {
			if(((n%10)+(n/10) + (n%10)*(n/10)) == n){
				System.out.println("yes");
			}
			else
				System.out.println("No");
		}
		sc.close();
	}
}
