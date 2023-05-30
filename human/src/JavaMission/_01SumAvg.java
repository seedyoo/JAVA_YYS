package JavaMission;

import java.util.Scanner;

public class _01SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어, 수학, 자바성적을 각각 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		double avg =(double) sum/3;
		
		
		
		System.out.println("영어 점수 :" + a);
		System.out.println("수학 점수 :" + b);
		System.out.println("자바 점수 :" + c);
		System.out.println("총점 :" + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		
		
		
		
		sc.close();
	}
}
