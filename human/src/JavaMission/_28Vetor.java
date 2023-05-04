package JavaMission;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _28Vetor {

	public static void main(String[] args) {
				Vector<String> vector = new Vector<String>(10);
				
				// 요소 추가
				vector.add("10");
				vector.add("20");
				vector.add("30");
				vector.add("40");
				vector.add("50");

				// 개수, 용량 확인
				System.out.println("벡터 요소 수 : " + vector.size());
				List<String> IList = new Vector<String>();
				
				for (String item : vector) {
					System.out.print(" " + item);
				}
				System.out.println();
				
				System.out.println(vector.size());
				
				System.out.println("벡터 용량 : " + vector.capacity());
				
//				Iterator<String> it = IList.iterator();
//				while(it.hasNext()) {
//					int n = it.next();
//					System.out.println(n);
//				}
//				
//				int sum = 0;
//				it = vector.iterator();  
//				while(it.hasNext()) {
//					int n = it.next();
//					sum += n; 
//				}
//				System.out.println("벡터에 있는 정수 합 : " + sum);
//				
				
				

				
	}
}
