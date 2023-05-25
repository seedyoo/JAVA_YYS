package codeup10;

import java.util.Scanner;

public class _1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a-b);
		}
		else if ( b > a) {
			System.out.println(b-a);
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
