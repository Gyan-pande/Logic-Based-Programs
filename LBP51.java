package lbpProgram;

import java.util.Scanner;

public class LBP51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an IP Address : ");
//		System.out.println(sc.nextLine().replace(".", "[.]"));
		String ip = sc.nextLine();
		
		for(int i=0; i<ip.length(); i++) {
			char ch = ip.charAt(i);
			if(ch =='.')
				System.out.print("[.]");
			else
				System.out.print(ch);
		}
				
		sc.close();
	}
	

}
