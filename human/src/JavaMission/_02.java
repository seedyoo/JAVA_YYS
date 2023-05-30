package JavaMission;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int N = sc.nextInt();

        // 홀수의 합계와 수식 계산
        int oddSum = 0;
        StringBuilder oddExpression = new StringBuilder();
        for (int i = 1; i <= N; i += 2) {
            oddSum += i;
            oddExpression.append(i);
            if (i < N - 1) {
                oddExpression.append("+");
            }
        }

        // 짝수의 합계와 수식 계산
        int evenSum = 0;
        StringBuilder evenExpression = new StringBuilder();
        for (int i = 2; i <= N; i += 2) {
            evenSum += i;
            evenExpression.append(i);
            if (i < N) {
                evenExpression.append("+");
            }
        }

        // N의 약수 출력
        StringBuilder divisors = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.append(i).append(" ");
            }
        }

        // 결과 출력
        System.out.println(oddExpression + "=" + oddSum);
        System.out.println(evenExpression + "=" + evenSum);
        System.out.println(divisors);

        sc.close();
    }
}
