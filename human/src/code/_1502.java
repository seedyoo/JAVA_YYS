package code;

import java.util.Scanner;

public class _1502 {

	public static void main(String[] args) {
		/*
		n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

		입력 예)

			3
			출력 예)
			1 4 7
			2 5 8
			3 6 9
		*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = k++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
		
		
	}

}
