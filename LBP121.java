package lbpProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class LBP121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element you want : ");
		int n =sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		System.out.println("======================");
		arr.remove(0);
		System.out.println(arr);
		sc.close();
	}
}
