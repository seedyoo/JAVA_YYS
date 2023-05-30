package JavaMission;

import java.util.Scanner;

public class _P {
    public static void calculateCurrencyAmount(String name, int amount) {
        int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; // 화폐 단위
        int[] currencyCounts = new int[currencies.length]; // 각 화폐의 매수를 저장할 배열

        int remainingAmount = amount; // 남은 금액을 저장하는 변수

        for (int i = 0; i < currencies.length; i++) {
            currencyCounts[i] = remainingAmount / currencies[i];
            remainingAmount %= currencies[i];
        }

        System.out.print("성명" + "\t" + "출장비" + "\t" + "오만원" + "\t" + "만원" + "\t" + "오천원" + "\t" + "천원" + "\t" + "오백원" + "\t" + "백원" + "\t" + "오십원" + "\t" + "십원" + "\t" + "오원" + "\t" + "일원" + "\t");
        System.out.println("");
        System.out.print(name + "\t");
        System.out.print(amount + "\t");
        for (int i = 0; i < currencies.length; i++) {
            System.out.print(currencyCounts[i] + "\t");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] totalCurrencyCounts = new int[10]; // 입력된 사람들의 전체 화폐 매수를 저장할 배열

        
        while (true) {
        	System.out.println("==================================================================================================");
            System.out.print("성명: ");
            String name = sc.nextLine();
            if (name.equals("QUIT")) {
            	System.out.println("---------------");            	
                break;
            }

            System.out.print("출장비: ");
            int amount = Integer.parseInt(sc.nextLine());
            System.out.println("---------------");
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

        System.out.print("전체 화폐 매수:" + "\t");
        int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        System.out.println("오만원" + "\t" + "만원" + "\t" + "오천원" + "\t" + "천원" + "\t" + "오백원" + "\t" + "백원" + "\t" + "오십원" + "\t" + "십원" + "\t" + "오원" + "\t" + "일원" + "\t");
        System.out.print("" + "\t");
        for (int i = 0; i < currencies.length; i++) {
            System.out.print("\t" + totalCurrencyCounts[i]);
        }
    }
}
