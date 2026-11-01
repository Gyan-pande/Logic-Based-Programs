package lbpProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class LBP122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many element you want : ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) 
			arr.add(sc.nextInt());
		
		System.out.println(arr+"\n"+"============================");
		arr.removeLast();
		System.out.println(arr);
		sc.close();
	}
}
