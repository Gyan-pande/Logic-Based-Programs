package lbpProgram;

import java.util.Scanner;

public class LBP68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine().toUpperCase();
		int [] arr = new int[3];
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'A')
				arr[0]++;
			else if(s.charAt(i) == 'B')
				arr[1]++;
			else if(s.charAt(i) == 'C')
				arr[2]++;
		}
		
		for(int n : arr)
			System.out.print(n+" ");
		System.out.println("\nA B C");
		sc.close();
	}
	
}
