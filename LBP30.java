package lbpProgram;

import java.util.Scanner;

public class LBP30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
//		StringBuffer str = new StringBuffer(sc.nextLine());
//		String dup = new String(str);
//		
//		
//		System.out.println(dup.equals(new String(str.reverse())));
//		System.out.println(dup+" "+str);
		
		
		String str = sc.nextLine();
		String rev="";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev+"  "+str);
		System.out.println(str.equals(rev));
		sc.close();
	}
}
