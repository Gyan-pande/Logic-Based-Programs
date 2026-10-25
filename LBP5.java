package lbpProgram;

import java.util.Scanner;

public class LBP5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		System.out.println("Your number after adding 1 : "+(sc.nextInt()+1));
		sc.close();
	}
}
