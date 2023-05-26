package JavaMission;

import java.util.Scanner;

public class _10Q {
    public static void calculateCurrencyAmount(String name, int amount) {
        int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; // 화폐 단위
        int[] currencyCounts = new int[currencies.length]; // 각 화폐의 매수를 저장할 배열

        int remainingAmount = amount; // 남은 금액을 저장하는 변수
        
        for (int i = 0; i < currencies.length; i++) {
            currencyCounts[i] = remainingAmount / currencies[i];
            remainingAmount %= currencies[i];
        }

        System.out.println("이름: " + name);
        System.out.println("출장비: " + amount);
        System.out.println("개인별 각 화폐 매수:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(currencies[i] + "원: " + currencyCounts[i] + "장");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] totalCurrencyCounts = new int[10]; // 입력된 사람들의 전체 화폐 매수를 저장할 배열

        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            if (name.equals("QUIT")) {
                break;
            }

            System.out.print("출장비: ");
            int amount = Integer.parseInt(scanner.nextLine());

            calculateCurrencyAmount(name, amount);

            // 전체 화폐 매수 계산
            int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
            int[] currencyCounts = new int[currencies.length];

            int remainingAmount = amount; // 남은 금액을 저장하는 변수
            
            for (int i = 0; i < currencies.length; i++) {
                currencyCounts[i] = remainingAmount / currencies[i];
                remainingAmount %= currencies[i];
                totalCurrencyCounts[i] += currencyCounts[i];
            }
        }

        System.out.println("전체 화폐 매수:");
        int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(currencies[i] + "원: " + totalCurrencyCounts[i] + "장");
        }
    }
}