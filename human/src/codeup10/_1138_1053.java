package codeup10;

import java.util.Scanner;

public class _1138_1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if ( a >= 0 && a < 2) {
		
			if( a == 0 ) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		
		sc.close();
	}
}
