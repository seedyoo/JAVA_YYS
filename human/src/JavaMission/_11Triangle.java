package JavaMission;

public class _11Triangle {

	double width;
	double height;
	
	public _11Triangle() {
	}

	public _11Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
