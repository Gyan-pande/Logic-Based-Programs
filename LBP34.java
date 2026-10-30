package lbpProgram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LBP34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Email : ");
		String email = sc.nextLine();
		
		Pattern p = Pattern.compile("[a-z]+[0-9|_]@gmail[.]com");
		Matcher m = p.matcher(email);
		
		if(m.find() && (m.group().equals(email)))
			System.out.println("True");
		else
			System.out.println("False");
		sc.close();
	}
}
