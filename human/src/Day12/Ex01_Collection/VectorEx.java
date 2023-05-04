package Day12.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 	List 인터페이스
 	- 요소 추가
 	add(E)				: 맨 끝에 추가
 	add(index, E)		: index 에 추가
 	set(index, E)		: index의 요소를 E로 지정(변경)
 	
 	- 요소 검색
 	get(index)			: index 에 있는 요소를 반환
 	contains(Object)	: 요소의 포함 여부 (true/false)
 	isEmpty()			: 컬렉션이 비어있는지 여부 (true/false)
 	size()				: 지정된 요소의 개수 반환
 	
 	- 요소 삭제
 	remove(index)		: index 에 있는 요소 삭제
 	remove(Object)		: 지정된 객체 요소를 삭제
 	clear()				: 모든 요소 삭제
 */
public class VectorEx {

	public static void main(String[] args) {
		// 컬렉션 객체 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		// 벳터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		
		// 요소 추가
		vector.add("포카리 스웨트");
		vector.add("코카콜라");
		vector.add("사이다");
		vector.add("마운틴듀");

		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size());
		
		// vector 는 내부적으로 배열로 요소를 관리한다.
		// - 기본 배열 요소의 개수는 10으로 생성하고,
		//	 배열이 꽉찰 때만다 2배씩 용량을 증가시킨다.
		System.out.println("용량 : " + vector.capacity());
		System.out.println();
		
		
		// 검색
		// 반복 방법 1
		System.out.println(">>반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법2
		System.out.println(">>반복 2");
		for (String item : vector) {
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 삭제
		// 삭제할 때, index 는 앞으로 한 칸씩 당겨진다
									// 0		1		2		3
									// 포카리		코카콜라	사이다	마운틴듀
		vector.remove(0);			// 코카콜라	사이다	마운틴듀
		vector.remove(1);			// 코카콜라	마운틴듀
		vector.remove("코카콜라");		// 마운틴듀
		vector.remove("마운틴듀");		// empty(요소없음)
		
		if( !vector.isEmpty() ) {
			for (String item : vector) {
				System.out.println("남은 메뉴 : " + item);
			}
		}
		else {
			System.out.println("메뉴가 없습니다");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		// Vector 는 List 인터페이스를 구현한 클래스
		List<String> newMenuList = new Vector<String>();
		
		System.out.println("메뉴 추가하기 (종료:0)");
		do {
			System.out.print("추가 메뉴 : ");
			String menu = sc.nextLine();
			
			if( menu.equals("0")) break;
			
			newMenuList.add(menu);
			
		} while (true);
		
		
		// 반복 방법 3
		// Iterator 를 이용한 반복
		// iterate - "반복하다", iterator - "반복자"
		// 해당 리스트 컬렉션으로부터 Iterator 객체를 가져옴
		// Iterator 메소드
		// hasNext()	: 다음 요소의 존재여부
		// next()		: 다음 요소를 반환
		Iterator<String> it = newMenuList.iterator();
		
		System.out.println("새로 추가된 메뉴 : ");
		while( it.hasNext() ) {
			String item = it.next();
			System.out.print(item);
			
			if( it.hasNext() ) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
	}
}



























