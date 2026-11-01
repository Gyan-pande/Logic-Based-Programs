package lbpProgram;

import java.util.Scanner;

public class LBP56 {
	
	public static void swap(String fn, String ln) {
		System.out.println(ln+"  "+fn);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first name : ");
		String fn = sc.nextLine();
		System.out.print("Enter a last name : ");
		String ln= sc.nextLine();
		swap(fn, ln);
		sc.close();
	}
}
