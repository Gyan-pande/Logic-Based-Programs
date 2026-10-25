package lbpProgram;

import java.util.Scanner;

public class LBP4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter books range : ");
		int b = sc.nextInt();
		
		if(b>=30 && b<=50) System.out.println("D");
		else if(b>=51 && b<=60) System.out.println("C");
		else if(b>=61 && b<=80) System.out.println("B");
		else if(b>=81 && b<=100)System.out.println("A");
		else System.out.println("Invalid");
		sc.close();
	}
}
