package lbpProgram;

import java.util.Scanner;

public class LBP1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		if(sc.nextInt() %2==0) System.out.println("Even Number");
		else System.out.println("Odd Number");
		sc.close();
	}
}
