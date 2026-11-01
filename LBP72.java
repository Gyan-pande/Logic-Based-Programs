package lbpProgram;

import java.util.Scanner;

public class LBP72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.print("Enter a number [0-1] : ");
		int n = sc.nextInt();
		
		if(n==1)
			System.out.println("Hello "+name);
		else if(n==0)
			System.out.println("Bye "+name);
		else
			System.out.println("Invalid input");
		sc.close();
	}
}
