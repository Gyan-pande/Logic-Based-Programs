package lbpProgram;

import java.util.Scanner;

public class LBP128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many element you want : ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt()+1;
		
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+"  ");
		sc.close();
	}
}
