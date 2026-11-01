package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		int arr[] = new int[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("==============================");
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		sc.close();
	}
}
