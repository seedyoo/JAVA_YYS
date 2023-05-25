package codeup10;

import java.util.Scanner;

public class _1117 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double b = sc.nextDouble();

        double result = a * b;
        String formattedResult = String.format("%.2f", result);

        System.out.println(formattedResult);
    }
}
