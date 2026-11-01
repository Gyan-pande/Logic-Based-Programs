package lbpProgram;

import java.util.Scanner;

public class LBP101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr)
			System.out.print(i+" ");
		sc.close();
	}
}
