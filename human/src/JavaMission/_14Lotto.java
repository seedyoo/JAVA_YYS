package JavaMission;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _14Lotto {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 게임? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> lottoNumbers = generateLottoNumbers();
            System.out.println("[" + (i + 1) + " 게임]" + ": " + lottoNumbers.toString());
        }
        
    }

    private static ArrayList<Integer> generateLottoNumbers() {
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            if (!lottoNumbers.contains(number)) {
                lottoNumbers.add(number);
            }
        }

        return lottoNumbers;
    }
}
