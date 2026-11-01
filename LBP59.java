package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		char s1[] = sc.nextLine().toCharArray();
		System.out.print("Enter second string : ");
		char[] s2 = sc.nextLine().toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(Arrays.equals(s1, s2));
		sc.close();
	}
}
