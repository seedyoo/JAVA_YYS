package JavaMission;

import java.util.Scanner;

public class _05 {
	

	public static void printMenu() {

		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.print("********** 번호 : ");
	}
	
	public static String selectMenu(int menuNo) {
		String menuName = "";
		
		switch (menuNo) {
		case 1: menuName = "황금올리브 반반한 치킨";
				break;
		case 2: menuName = "뿌잉클 치킨";
				break;
		case 3: menuName = "처갓집에서 호식이가 만든 치킨";
				break;
		default:menuName = "(선택안함)";
				break;
		}
		return menuName;
	}
	
	
	public static void main(String[] args) {
		int menuNo = 0;			// 메뉴번호
		String menuName = "";	// 메뉴이름
		int count = 0;			// 주문개수
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
			printMenu();
			menuNo = sc.nextInt();
			
			if ( menuNo == 0) break;
			
			menuName = selectMenu(menuNo);
			
			if( menuNo >= 0 && menuNo <= 3) {
			System.out.println(menuName + "이 주문되었습니다.\n");
			count++;
			}
			else {
				System.out.println("0~3번 사이의 번호를 입력하세요.");
			}
			
		} while (true);
		
		System.out.println("총 " + count + " 개의 상품을 완료하였습니다.");
		
		sc.close();
		
	}
	
}
