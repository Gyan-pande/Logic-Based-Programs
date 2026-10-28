package lbpProgram;

import java.util.Scanner;

public class LBP19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for binary : ");
		int n = sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
		sc.close();
	}
}
