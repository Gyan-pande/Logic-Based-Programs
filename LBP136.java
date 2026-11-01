package lbpProgram;

import java.util.Scanner;

public class LBP136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an array size : ");
		int n = sc.nextInt();
		int[] n1 = new int[n];
		int[] n2 = new int[n];
		
		for(int i=0; i<n; i++)
			n1[i] = sc.nextInt();
		
		System.out.println("===========================");
		
		for(int i=0; i<n; i++)
			n2[i] = sc.nextInt();
		
		System.out.println("=============================");
		
		int i=0, j=n-1;
		while(i<=j) {
			System.out.print(n1[i++]+n1[j--]);
		}
		
		i=0; j=n-1;
		System.out.println("\n=============================");
		
		while(i<=j) {
			System.out.print(n2[i++]+n2[j--]);
		}
		
		sc.close();
		
	}
}
