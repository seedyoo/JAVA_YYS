package code;

import java.util.Scanner;

public class _1508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a[][] = new int[N][N];
		
		
		// 1열의 값들을 입력
		for (int i = 0; i < N; i++) {
			a[i][0] = sc.nextInt();
		}
		
		
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j <= i; j++) {
				a[i+1][j+1] = a[i+1][j] - a[i][j];
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
