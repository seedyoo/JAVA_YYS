package codeup10;

import java.util.Scanner;

public class _1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println(a);
		}
		else if (b < a && b < c) {
			System.out.println(b);
		}
		else if (c < a && c < b) {
			System.out.println(c);
		}
		else if (a == b && a < c) {
			System.out.println(a);
		}
		else if (a == b && a > c) {
			System.out.println(c);
		}
		else if (b == c && a < b) {
			System.out.println(a);
		}
		else if (b == c && a > b) {
			System.out.println(b);
		}
		else if (a == c && b < c) {
			System.out.println(b);
		}
		else if (a == c && b > c) {
			System.out.println(c);
		}
		else if (a == c && b == c) {
			System.out.println(a);
		}
		
		sc.close();
	}
}
