package lbpProgram;

import java.util.Scanner;

public class LBP80 {
	
	public static boolean hexString(String s) {
		if(s.length() !=6)
			return false;
		else if(s.charAt(0) !='#')
			return false;
		else {
			for(int i=1; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(!((ch >='A' && ch<='F') || (ch >='a' && ch<='f') || (ch>='0' && ch<='9')))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		System.out.println(hexString(sc.nextLine()));
//		System.out.println(sc.nextLine().matches("#[A-Fa-f0-9]{5}"));
		sc.close();
	}
}
