package lbpProgram;

import java.util.Scanner;

public class LBP79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String[] arr = sc.nextLine().split(" ");
		System.out.print(arr[arr.length-1]+" ");
		
		for(int i=arr.length-2; i>=1; i--)
			System.out.print(new StringBuffer(arr[i]).reverse()+" ");
		
		System.out.print(arr[0]);
		
		
		sc.close();
	}
}
