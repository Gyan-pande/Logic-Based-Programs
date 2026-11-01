package lbpProgram;

import java.util.Scanner;

public class LBP129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you wnat : ");
		int[] arr = new int[sc.nextInt()];
		int[] n = new int[999];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
			n[arr[i]]++;
		
		int max=0;
		for(int i=0; i<n.length; i++) {
			if(n[i] > max)
				max = n[i];
		}
		System.out.println(max);
		sc.close();
	}
}
