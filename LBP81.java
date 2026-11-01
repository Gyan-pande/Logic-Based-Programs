package lbpProgram;

import java.util.Scanner;

public class LBP81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String[] arr = sc.nextLine().split(" ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()%2==0)
				System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
