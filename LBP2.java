package lbpProgram;

import java.util.Scanner;

public class LBP2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		if(n%2!=0) System.out.println("Weird");
		if(n%2==0 && n>=2 && n<=5) System.out.println("Not Weird");
		if(n%2==0 && n>=6 && n<=20) System.out.println("Weird");
		if(n%2==0 && n>20) System.out.println("Not Weird");
		sc.close();
	}
}
