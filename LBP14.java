package lbpProgram;

import java.util.Scanner;

public class LBP14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
//		StringBuffer num = new StringBuffer(sc.nextLine());
//		System.out.println(num.reverse());
		
		int num = sc.nextInt();

		while(num !=0) {
			System.out.print(num%10);
			num/=10;
		}
		sc.close();
		
	}
}
