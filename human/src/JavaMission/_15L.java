package JavaMission;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _15L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 게임? ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        int[][] lottoNumbers = new int[numGames][7];

        for (int i = 0; i < numGames; i++) {
            System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2.수동) : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                lottoNumbers[i][0] = 0; // 자동 번호 표시
                lottoNumbers[i] = generateRandomNumbers();
            } else if (choice == 2) {
                lottoNumbers[i][0] = 1; // 수동 번호 표시
                lottoNumbers[i] = enterManualNumbers(scanner);
            }
        }

        scanner.close();

        System.out.println("############ 인생역전 Lottoria ############");
        System.out.println("발행일 : 2021/06/12일 (토) 05:01:58");
        System.out.println("추첨일 : 2021/06/12일 (토) 21:00:00");
        System.out.println("지급기한 : 2022/06/13일 (월)");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < numGames; i++) {
            char label = (char) ('A' + i);
            String type = (lottoNumbers[i][0] == 0) ? "자 동" : "수 동";
            System.out.printf("%c %s ", label, type);

            for (int j = 1; j < 7; j++) {
                System.out.printf("%02d ", lottoNumbers[i][j]);
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------");
        System.out.println("금액                                ₩5,000");
        System.out.println("#########################################");

        int[] winningNumbers = generateRandomNumbers();
        int bonusNumber = generateRandomNumber();

        System.out.print("당첨 번호 : ");
        printNumbers(winningNumbers);
        System.out.printf("보너스 번호 : %d\n", bonusNumber);
        System.out.println("#################### 당첨 결과 ####################");

        for (int i = 0; i < numGames; i++) {
            char label = (char) ('A' + i);
            String type = (lottoNumbers[i][0] == 0) ? "자 동" : "수 동";
            String result = (Arrays.equals(Arrays.copyOfRange(lottoNumbers[i], 1, 7), winningNumbers)) ? "(1등)" : "(낙첨)";
            System.out.printf("%c %s ", label, type);
            printNumbers(Arrays.copyOfRange(lottoNumbers[i], 1, 7));
            System.out.printf(" %s\n", result);
        }

        System.out.println("#################################################");
    }

    public static int[] generateRandomNumbers() {
        int[] numbers = new int[7];

        for (int i = 1; i < 7; i++) {
            numbers[i] = generateRandomNumber();
        }

        return numbers;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }

    public static int[] enterManualNumbers(Scanner scanner) {
        int[] numbers = new int[7];

        for (int i = 1; i < 7; i++) {
            System.out.print(i + " : ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
            if (numbers[i] > 45) {
            	System.out.println("45이하 숫자를 처음부터 다시 입력하시오");
            	return enterManualNumbers(scanner);
            }
            else if (numbers[i] < 0) {
            	System.out.println("1이상의 숫자를 처음부터 다시 입력하시오");
            	return enterManualNumbers(scanner);
            }
        }

        return numbers;
    }

    public static void printNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.printf("%02d ", numbers[i]);
        }
    }
}