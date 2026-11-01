package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP112 {
	
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
		System.out.print("Enter search element : ");
		int num = sc.nextInt();
		
		//Arrays.sort(arr);
		int res = Arrays.binarySearch(arr, num);
		try {
			System.out.println("Index = "+res+" ==> "+arr[res]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Item is not found!");
		}
		
		sc.close();
	}
}
