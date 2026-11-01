package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		String arr[] = new String[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr);

		for(String s: arr)
			System.out.print(s+" ");
		
		sc.close();
	}
}
