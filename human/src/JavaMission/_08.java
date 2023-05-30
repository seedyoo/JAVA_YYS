package JavaMission;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 N을 입력하세요: ");
        int N = scanner.nextInt();

        int[][] array = new int[N][N];
        int value = 1;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        System.out.println("배열 요소 출력:");
        printArray(array);

        scanner.close();
    }

    // 배열 요소를 출력하는 함수
    public static void printArray(int[][] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
