package codeup10;

import java.util.Scanner;

public class _1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 홀수, 짝수 조건?
		if ( a % 2 == 1) {
			System.out.println("odd");
		}
		
		else {
			System.out.println("even");
		}
		
		if ( b % 2 == 1) {
			System.out.println("odd");
		}
		
		else {
			System.out.println("even");
		}
		
		if ( c % 2 == 1) {
			System.out.println("odd");
		}
		
		else {
			System.out.println("even");
		}
		
		sc.close();
	}
}
