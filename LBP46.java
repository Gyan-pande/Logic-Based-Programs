package lbpProgram;

import java.util.Scanner;

public class LBP46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a full year in format of - : ");
		String[] arr = sc.next().split("-");
		int dd = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		System.out.println(arr[2].endsWith(Integer.toString(dd*mm)));
		
		
		
		
		
		
		
		
//		 switch ((ddmn+"").length()) {
//		case 1: 
//			if(ddmn == yy%10)
//				System.out.println(true);
//			break;
//		case 2: 
//			if(ddmn == yy%100)
//				System.out.println(true);
//			break;
//		case 3: 
//			if(ddmn == yy%1000)
//				System.out.println(true);
//			break;
//			
//		default:
//			System.out.println(false);
//		}
		 sc.close();
		 
	}
}
