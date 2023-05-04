package Day12.Ex01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 순차적으로 요소를 추가
// - ArrayList 와 LinkedList 비교
// - 결론 : LinkedList 가 더 빠르다 (이론상)
// - 실제 : 320개 이상의 데이터를 추가할 때까지는 ArrayList 가 빠르고
//		   그 이후의 개수에는 LinkedList 가 더 빠르다
public class ArrayListLinkedList {
	
	public static void main(String[] args) {
		
		// 데이터 삽입/삭제 는 LinkedList 가 ArraysList 보다 빠르다
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		// 밀리초		: 1/1000초
		// 마이크로초	: 10^-6초
		// 나노초		: 10^-9초
		startTime = System.nanoTime();	// 시스템의 시간을 ns 단위로 출력
		// ArrayList 데이터 삽입
		for (int i = 0; i < 10000; i++) {
			arrayList.add(String.valueOf(i) );
		}
		
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간 : " + arrayListTime + "ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList.add(String.valueOf(i) );
		}
		
		endTime = System.nanoTime();
		
		// 7238700	: ArrayList(측정값)
		// 2877500	: LinkedList(측정값)
		
		long linkedListTime = (endTime - startTime);
		System.out.println("LinkedList 데이터 삽입 시간 : " + linkedListTime + "ns");
		
		if( arrayListTime > linkedListTime ) {
			System.out.println("ArrayList 보다 LinkedList 가 데이터 삽입 속도이 더 빠르다");
		} else {
			System.out.println("LinkedList 보다 ArrayList 가 데이터 삽입 속도이 더 빠르다");
		}
		
		
	}

}