package lbpProgram;

import java.util.Scanner;

public class LBP105 {
	
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
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
			if(isPrime(n))
				sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
}
