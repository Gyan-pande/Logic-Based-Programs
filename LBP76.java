package lbpProgram;

import java.util.Scanner;

public class LBP76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String [] arr = sc.nextLine().split(" ");
		int max =0; String maxStr="";
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].length() > max)
			{
				max = arr[i].length();
				maxStr = arr[i];
			}
		}
		System.out.println(maxStr);
		sc.close();
	}
}