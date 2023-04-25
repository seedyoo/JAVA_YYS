package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 입력받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch 문을 사용하여 작성하시오.
		// * switch 문 안에서 break 쓰지 않으면,
		// 조건에 맞는 case 영역뿐만 아니라, 이후의 코드로 실행된다.
		
		
	
		
		switch (num%5) {
		case 0: 
		case 1: 
			System.out.println("*");
			break;
		case 2: 
		case 3: 
		case 4: 
		default:
			System.out.println("**");
			break;
		}
		
		
		sc.close();
		
	}
}
