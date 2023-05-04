package JavaMission;

public class _11Circle {

	double radius;
	double PI = Math.PI;
	
	public _11Circle() {
	}
	
	public _11Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}

