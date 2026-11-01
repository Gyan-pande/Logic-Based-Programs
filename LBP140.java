package lbpProgram;

import java.util.Scanner;

public class LBP140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n =sc.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr1[i] = sc.nextInt();
		
		System.out.println("=========================");
		
		for(int i=0; i<n; i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("=========================");
		
		for(int i=0; i<n; i++)
			System.out.print(arr1[i] - arr2[i]+" ");
		sc.close();
		
	}
}
