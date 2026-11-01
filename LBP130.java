package lbpProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LBP130 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("how many element you want : ");
		int n = sc.nextInt();
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<n; i++)
			set.add(sc.nextInt());
		
		for(int n1 : set)
			System.out.print(n1+"  ");
		sc.close();
			
			
	}
}
