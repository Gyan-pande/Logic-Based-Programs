package lbpProgram;

import java.util.Scanner;

public class LBP107 {
	
	public static int strong(int n) {
		int sum=0;
		while(n !=0) {
			int d = n%10;
			sum+=fact(d);
			n/=10;
		}
		return sum;
	}
	
	public static int fact(int n) {
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
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
			if(strong(n) ==n)
				sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
}
