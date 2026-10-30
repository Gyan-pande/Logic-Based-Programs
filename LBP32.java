package lbpProgram;

import java.util.Scanner;

public class LBP32 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine().toLowerCase();
		int count=0;
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >='a' && ch <='z' || ch>='0' && ch<='9')
				continue;
			else
				count++;
		}
		
		System.out.println(count);
		sc.close();
	}
}
