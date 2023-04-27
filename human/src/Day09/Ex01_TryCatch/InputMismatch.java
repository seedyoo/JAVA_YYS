package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuname = "";
		int menuNo = 0;
		
		do {
			System.out.println("1. Java");
			System.out.println("2. HTML");
			System.out.println("3. CSS");
			System.out.println("4. JavaScript");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력 : ");
			
			// 예외 메세지 : java.util.InputMismatchException
			
			// try-catch 에외처리문 작성
			try {
				menuNo = sc.nextInt();		// 예외방생 가능성 있는 문장
			} catch (InputMismatchException e) {
				sc.next();					// 입력 스트림에 남아있는 (엔터) 비움
				System.err.println("(0~4) 사이의 정수를 입력해주세요");
				continue;
			}
			
			// 종료 조건
			if( menuNo == 0 ) break;

			switch (menuNo) {
			case 1: menuname = "Java";			break;
			case 2: menuname = "HTML";			break;
			case 3: menuname = "CSS";			break;
			case 4: menuname = "JavaScript";	break;
			default: menuname = "선택없음";		break;
			}
			System.out.println(menuname + "(을/를) 공부합니다");
			
		} while (true);
	}
	
}
