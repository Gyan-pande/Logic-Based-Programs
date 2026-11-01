package lbpProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class LBP120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			arr.addLast(sc.nextInt());
		}
		System.out.println(arr);
		sc.close();
		
		
		
		
//		int arr[] = new int[sc.nextInt()];
//		sc.nextLine();
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("Enter an element : ");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("==============================");
//		System.out.println(arr[arr.length-1]);
//		sc.close();
	}
}
