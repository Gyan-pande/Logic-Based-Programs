package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP111 {
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

		for(int i = arr.length-1; i>=0; i--)
			System.out.print(arr[i]+"  ");
		
		sc.close();
	}
}
