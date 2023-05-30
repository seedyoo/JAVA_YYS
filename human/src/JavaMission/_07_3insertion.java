package JavaMission;

import java.util.Scanner;

public class _07_3insertion {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grades = new int[5];

        System.out.print("학생 5명의 성적을 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            grades[i] = scanner.nextInt();
        }

        // 오름차순 정렬
        ascendingSort(grades);
        System.out.print("오름차순 정렬 결과: ");
        printArray(grades);

        // 내림차순 정렬
        descendingSort(grades);
        System.out.print("내림차순 정렬 결과: ");
        printArray(grades);

        scanner.close();
    }

    // 삽입 정렬을 이용하여 오름차순 정렬하는 함수
    public static void ascendingSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 삽입 정렬을 이용하여 내림차순 정렬하는 함수
    public static void descendingSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 배열 요소를 출력하는 함수
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
