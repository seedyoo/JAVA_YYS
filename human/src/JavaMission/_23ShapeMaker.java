package JavaMission;

import java.util.Scanner;

public class _23ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_19Shape shape = null;
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		// 입력 받은 도형 정보 배열
		_19Shape[] shapeList = new _19Shape[3];
		int index = 0;
		
		while( true ) {
			if( index == 3 )
				break;
			
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.println(">>");
			String input = sc.next();
			
			if( input.equals("그만") ) 
				break;
			
			switch (input) {
			// 삼각형
			case "1":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					
					shape = new _20Triangle(width, height);
					shapeList[index++] = shape;
					break;

			// 사각형
			case "2":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("높이>>");
					height = sc.nextDouble();
				
					shape = new _21Rectangle(width, height);
					shapeList[index++] = shape;
					break;
				
			// 원형
			case "3":
					System.out.print("반지름>>");
					radius = sc.nextDouble();
					
					shape = new _22Circle(radius);
					shapeList[index++] = shape;
			}
			
		} // - while 끝
		
		
		for (_19Shape s : shapeList) {
			
			if( s == null ) {
				continue;
			}
			
			// instanceof 인스턴스를 비교하는 연산
			if( s instanceof _20Triangle)
				System.out.println("[삼각형]");
			if( s instanceof _21Rectangle)
				System.out.println("[사각형]");
			if( s instanceof _22Circle)
				System.out.println("[원형]");
			
			double area = s.area();
			double round = s.round();
			
			roundSum = roundSum + round;
			areaSum = areaSum + area;
			
			System.out.print("넓이 : " + area + " \t");
			System.out.print("둘레 : " + round + " \t");
			System.out.println();
		}
		
		System.out.println("둘레 총합 : " + roundSum);
		System.out.println("넓이 총합 : " + areaSum);
		
		sc.close();
	}
}
