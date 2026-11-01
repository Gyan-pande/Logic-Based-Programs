package lbpProgram;

import java.util.Scanner;

public class LBP85 {
	
	public static String conver(int n) {
		String[] ones = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Forteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
		
		String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		
		if(n<20)
			return ones[n];
		
		else if(n<100)
			return tens[n/10]+" "+conver(n%10);
		
		else if(n<1_000)
			return ones[n/100]+" Hundred"+((n%100 !=0)?" "+conver(n%100):"");
		
		else if(n<1_00_000)
			return conver(n/1000)+" Thousand"+((n%1000 !=0)?" "+conver(n%1000):"");
		
		else if(n<10_000_000)
			return conver(n/100_000)+" Lakh"+((n%100_000 !=0)?" "+conver(n%100_000):"");
		
		else if(n<1000000000)
			return conver(n/1_00_00_000)+" Crore"+((n%1_00_00_000 != 0)?" "+conver(n%1_00_00_000):"");
					
		else
			return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(n<0)
			System.out.println("Invalid");
		else if(n==0)
			System.out.println("Zero");
		else
			System.out.println(conver(n));
		sc.close();
	}
}
