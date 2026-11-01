package lbpProgram;

import java.util.Scanner;

public class LBP108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextInt();
		}
		
		
		int sum=0;
		for(int n : arr) {
			if(n%10 ==3)
				sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
}
