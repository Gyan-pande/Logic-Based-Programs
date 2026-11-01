package lbpProgram;

import java.util.Scanner;

public class LBP118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		int arr[] = new int[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("==============================");
		System.out.print("Enter search element : ");
		int num = sc.nextInt();
		int c=0;
		for(int n1 : arr) {
			if(num == n1)
				c++;
		}
		System.out.println(c);
		sc.close();
	}
}
