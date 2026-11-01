package lbpProgram;

import java.util.Scanner;

public class LBP95 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a string : ");
		 String[] arr = sc.nextLine().split(" ");
		 
		 for(String s: arr)
			 System.out.print(s.charAt(0)+" ");
		 sc.close();
	}
}
