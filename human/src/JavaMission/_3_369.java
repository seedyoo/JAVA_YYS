package JavaMission;

import java.util.Scanner;
public class _3_369 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = 100;

		for (int i = 1; i <= N; i++) {
			boolean a= false;
			boolean b= false;
			int one = i % 10;
			if (one ==3 || one == 6 || one == 9) {
				a = true;
			}
			one = i / 10;
			if (one ==3 || one == 6 || one == 9) {
				b = true;
			}
			if ( a && b ) {
			System.out.println("**");
			}
			else if (a||b == true) {
			System.out.println("*");
			}
			else {
			System.out.println(i + "");
			}
		}
	sc.close();
	}
}
