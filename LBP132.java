package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		
		for(int i=0; i<arr.length-1; i++)
			arr[i] = max;
		
		for(int n : arr)
			System.out.print(n+"  ");
		sc.close();
	}
}
