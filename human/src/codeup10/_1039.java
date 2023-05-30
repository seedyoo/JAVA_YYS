package codeup10;

import java.util.Scanner;

public class _1039 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String a = sc.nextLine();


        String b = sc.nextLine();

        long num1;
        long num2;
        num1 = Long.parseLong(a);
        num2 = Long.parseLong(b);
        

        long sum = num1 + num2;
        System.out.println(sum);
        sc.close();
    }
}
