package lbpProgram;

import java.util.Scanner;

public class LBP25 {
	
	public static float celToFer(float n) {
		return ((n*9)/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a temp in celcius : ");
		System.out.println(celToFer(sc.nextFloat()));
		sc.close();
	}
}
