package JavaMission;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }

            // '*' 출력
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }

        scanner.close();
    }
}
