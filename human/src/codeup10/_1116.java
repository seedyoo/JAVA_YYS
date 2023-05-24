package codeup10;

import java.util.Scanner;

public class _1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int minus = a - b;
		int multi = a * b;
		int division = a / b;
		

		
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + minus);
		System.out.println(a + "*" + b + "=" + multi);
		System.out.println(a + "/" + b + "=" + division);
		
		sc.close();
	}
}
