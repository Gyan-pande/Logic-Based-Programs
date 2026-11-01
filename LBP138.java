package lbpProgram;

import java.util.Scanner;

public class LBP138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int[] n = new int[sc.nextInt()];
		
		for(int i=0; i<n.length; i++)
			n[i] = sc.nextInt();
		int even=0,odd=0;
		for(int temp : n) {
			if(temp%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.println("even "+even+" odd "+odd);
		sc.close();
	}
}
