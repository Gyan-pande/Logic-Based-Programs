package lbpProgram;

import java.util.Scanner;

public class LBP126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many elemnt you want : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("=======================");
		System.out.print("position to update : ");
		int po = sc.nextInt();
		System.out.print("update with what : ");
		int up = sc.nextInt();
		
		try {
			arr[po] = up;
			for(int n1 : arr)
				System.out.print(n1+"  ");
		} catch (Exception e) {
			System.out.print("Invalid position");
		}
		
		sc.close();
		
	}
}
