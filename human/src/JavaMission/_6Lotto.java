package JavaMission;

import java.util.Arrays;
import java.util.Scanner;

public class _6Lotto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 게임? ");
        int N = scanner.nextInt(); // N은 게임의 개수를 의미합니다. 원하는 값으로 수정해주세요.

        for (int i = 0; i < N; i++) {
            int[] lottoNumbers = generateLottoNumbers();
            System.out.println("로또 번호 " + (i + 1) + ": " + Arrays.toString(lottoNumbers));
        }
    }

    private static int[] generateLottoNumbers() {
        int[] lottoNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            int number;
            boolean duplicate;

            do {
                number = (int) (Math.random() * 45) + 1;
                duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);

            lottoNumbers[i] = number;
        }

        Arrays.sort(lottoNumbers); // 번호를 오름차순으로 정렬합니다.
        return lottoNumbers;
    }
}
