package lbpProgram;

import java.util.Scanner;

public class LBP106 {
	
	public static boolean isPalindrome(int n) {
		int sum=0, temp=n;
		
		while(n !=0) {
			int d = n%10;
			sum = sum*10+d;
			n/=10;
		}
		return sum ==temp;
	}
	
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
			if(isPalindrome(n))
				sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
}
