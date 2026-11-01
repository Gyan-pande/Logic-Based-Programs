package lbpProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class LBP123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many elemnt you want : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
			arr.add(sc.nextInt());
		System.out.println("=========================");
		System.out.println("enter index number for deleting an element : ");
		try {
			arr.remove(sc.nextInt());
			System.out.println(arr);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		sc.close();
	}
}
