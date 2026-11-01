package lbpProgram;

import java.util.Scanner;

public class LBP109 {
	
	public static boolean search(String search, String arr[]) {
		for(String s : arr) {
			if(s.equalsIgnoreCase(search))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements you want ! : ");
		String arr[] = new String[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = sc.nextLine();
		}
		
		System.out.print("Enter searching element : ");
		System.out.println(search(sc.nextLine(), arr));
		
		
		sc.close();
	}
}
