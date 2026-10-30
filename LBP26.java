package lbpProgram;

import java.util.Scanner;

public class LBP26 {
	public static float ferToCel(float n) {
		return (n-32)*5/9;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a temp in fahrenheit : ");
		System.out.println(ferToCel(sc.nextFloat()));
		sc.close();
	}
}
