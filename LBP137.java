package lbpProgram;

import java.util.Scanner;

public class LBP137 {
	
	public static int reverse(int n) {
		int rev=0;
		while(n !=0) {
			int dig = n%10;
			rev = rev*10+dig;
			n/=10;
		}
		return rev;	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int[] n = new int[sc.nextInt()];
		
		for(int i=0; i<n.length; i++)
			n[i] = sc.nextInt();
		
		for(int temp : n)
			System.out.print(reverse(temp)+"  ");
		sc.close();
		
	}
}
