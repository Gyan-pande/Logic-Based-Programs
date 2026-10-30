package lbpProgram;

import java.util.Scanner;

public class LBP48 {
	
	public static int videoLen(int mm, int ss) {
		return mm*60+ss;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter video lenght in MM:SS : ");
		String[] arr = sc.next().split(":");
		System.out.println(videoLen(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
		sc.close();
	}
}
