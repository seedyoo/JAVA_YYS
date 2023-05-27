package JavaMission;

public class _22Circle extends _19Shape {

	double radius;
	
	public _22Circle() {
		this(0);
	}

	public _22Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// (원주율) x (반지름) x (반지름)
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2 x (원주율) x (반지름)
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
