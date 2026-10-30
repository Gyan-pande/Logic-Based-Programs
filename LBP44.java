package lbpProgram;

import java.util.Scanner;

public class LBP44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How large array you want to create : ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter "+(i+1)+" th value : ");
			arr[i] = sc.nextInt();
		}
		
		int se=0,so=0;
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0)
				se+=arr[i];
			else
				so+=arr[i];
		}
		
		System.out.println("\nThe difference of even and odd is : "+Math.abs(se-so));
		sc.close();
	}
}
