package lbpProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LBP84 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enmter a string : ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		String sorted = new String(arr);
		System.out.println(s.equals(sorted));
		sc.close();
	}
}
