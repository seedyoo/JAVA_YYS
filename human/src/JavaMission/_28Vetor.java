package JavaMission;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _28Vetor {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // 요소 수 출력
        System.out.println("벡터 요소 수: " + vector.size());

        // 벡터 요소 출력
        // System.out.print("벡터 요소: ");
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 요소 수 출력
        System.out.println("요소 수: " + vector.size());

        // 벡터 용량 출력
        System.out.println("벡터 용량: " + vector.capacity());

        // 총합 계산
        int sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += vector.get(i);
        }
        System.out.println("총합: " + sum);
				
				

				
	}
}
