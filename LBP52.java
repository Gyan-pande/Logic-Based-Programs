package lbpProgram;

import java.util.Scanner;

public class LBP52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first string : ");
		String jw = sc.nextLine();
		System.out.print("Enter a Second string : ");
		String sn = sc.nextLine();
		
		int c=0;
		for(int i=0; i<jw.length(); i++)
		{
			for(int j=0; j<sn.length(); j++)
			{
				if(jw.charAt(i) == sn.charAt(j))
					c++;
			}
		}
		System.out.println(c);
		sc.close();
	}

}
