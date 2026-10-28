package lbpProgram;

import java.util.Scanner;

public class LBP18 {
	
	public static int checkBirthday(String mon, int day) {
		if(mon.equalsIgnoreCase("july") && day==5)
			return 1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your birth month : ");
		String mon = sc.nextLine();
		System.out.print("Enter you birth day : ");
		int day = sc.nextInt();
		
		if(checkBirthday(mon, day) == 1)
			System.err.println("Today is your birthday");
		else
			System.err.println("Today isn't your birthday");
		sc.close();
	}
}
