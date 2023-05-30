package JavaMission;

public class _11total {

	public static void main(String[] args) {
		
		_11Triangle triangle = new _11Triangle(10, 20);
		_11Rectangle ractangle = new _11Rectangle(10, 20);
		_11Circle circle = new _11Circle(5);
		_11Trapezoid trapezoid = new _11Trapezoid(5, 10, 8);
		
		System.out.println("삼각형의 넓이 : " + triangle.getArea());
		System.out.println("사각형의 넓이 : " + ractangle.getArea());
		System.out.println("원형의 넓이 : " + circle.getArea());
		System.out.println("사다리꼴의 넓이 : " + trapezoid.getArea());
		
	}
}
