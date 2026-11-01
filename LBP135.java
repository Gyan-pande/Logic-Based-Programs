package lbpProgram;

import java.util.Scanner;

public class LBP135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array1 : ");
		int n1[] = new int[sc.nextInt()];
		
		for(int i=0; i<n1.length; i++)
			n1[i] = sc.nextInt();
		
		System.out.println("==============================");
		
		System.out.print("Enter size of array2 : ");
		int n2[] = new int[sc.nextInt()];
		
		for(int i=0; i<n2.length; i++)
			n2[i] = sc.nextInt();
		
		int sum=0;
		
		
		for(int i=0; i<n1.length; i++) {
			if(i%2!=0)
				sum+=n1[i];
		}
		
		for(int i=0; i<n2.length; i++) {
			if(i%2!=0)
				sum+=n2[i];
		}
		System.out.println("============\n"+sum);
		sc.close();
	}
}
