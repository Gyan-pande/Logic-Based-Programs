package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arrya size : ");
		int n1[] = new int[sc.nextInt()];
		 
		for(int i=0; i<n1.length; i++)
			n1[i] = sc.nextInt();
		
		
		Arrays.sort(n1,0,n1.length/2);
		for(int n : n1)
			System.out.print(n+" ");
		sc.close();
	}
}
