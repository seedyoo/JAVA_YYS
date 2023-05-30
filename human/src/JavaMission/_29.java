package JavaMission;

import java.util.HashMap;
import java.util.Scanner;

public class _29 {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int wordCount;

        System.out.print("입력한 단어 수: ");
        wordCount = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        for (int i = 0; i < wordCount; i++) {
            System.out.print("한글: ");
            String koreanWord = scanner.nextLine();
            System.out.print("영어: ");
            String englishWord = scanner.nextLine();

            dictionary.put(koreanWord, englishWord);
        }

        while (true) {
            System.out.print("검색할 단어 (종료하려면 0): ");
            String searchWord = scanner.nextLine();

            if (searchWord.equals("0")) {
                System.out.println("종료합니다.");
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                String translatedWord = dictionary.get(searchWord);
                System.out.printf("%s은(는) 영어로 \"%s\"입니다.\n", searchWord, translatedWord);
            } else {
                System.out.println("단어를 찾을 수 없습니다.");
            }
        }
    }
}