package lbpProgram;

import java.util.Scanner;

public class LBP125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many element you wnat : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("==================");
		
		System.out.print("Enter an element : ");
		int upele = sc.nextInt();
		System.out.print("update with : ");
		int obj = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i] == upele)
				arr[i] = obj;
		}

		for(int n1 : arr)
			System.out.print(n1+"  ");
		
		sc.close();
	}
}
