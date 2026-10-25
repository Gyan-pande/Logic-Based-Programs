package lbpProgram;

import java.util.Scanner;

public class LBP6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many coffie you want?");
		int coffie = sc.nextInt();
		System.out.println("We give you "+(coffie+coffie/6));
		sc.close();
	}
}
